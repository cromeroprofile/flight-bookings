package com.flightbookings.flight_bookings.services;

import com.flightbookings.flight_bookings.exceptions.SeatAlreadyBookedException;
import com.flightbookings.flight_bookings.exceptions.SeatNotFoundException;
import com.flightbookings.flight_bookings.models.ESeatLetter;
import com.flightbookings.flight_bookings.models.Flight;
import com.flightbookings.flight_bookings.models.Seat;
import com.flightbookings.flight_bookings.repositories.ISeatRepository;
import com.flightbookings.flight_bookings.services.interfaces.FlightService;
import com.flightbookings.flight_bookings.services.interfaces.SeatService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Implementation of the SeatService interface for managing seat operations.
 */
@Service
@RequiredArgsConstructor
@Slf4j
public class SeatServiceImpl implements SeatService {

    private final ISeatRepository seatRepository;
    private final FlightService flightService;



    @Override
    public Optional<Seat> getSeatById(Long seatId) {
        return seatRepository.findById(seatId);
    }

    @Override
    @Transactional
    public List<String> initializeSeats(Flight flight) {
        List<Seat> seatsToSave = IntStream.rangeClosed(1, flight.getNumRows())
                .boxed()
                .flatMap(row -> Stream.of(ESeatLetter.values())
                        .map(letter -> {
                            String seatName = row + letter.name();
                            if (seatRepository.findByFlightAndSeatName(flight, seatName).isEmpty()) {
                                Seat seat = new Seat(null, row, letter, false, flight, null);
                                seat.setSeatName(seatName);
                                return seat;
                            } else {
                                log.debug("Seat {} already exists. Skipping...", seatName);
                                return null;
                            }
                        })
                )
                .filter(Objects::nonNull)
                .toList();

        if (!seatsToSave.isEmpty()) {
            seatRepository.saveAll(seatsToSave);
        }

        return seatsToSave.stream()
                .map(Seat::getSeatName)
                .toList();
    }

    @Override
    @Transactional
    public void initializeSeatsForAllFlights() {
        List<Flight> flights = flightService.getAllFlights();
        flights.forEach(this::initializeSeats);
        log.debug("Seats initialized for all flights..");
    }

    @Override
    @Transactional
    public Seat reserveSeat(Flight flight, String seatName) {
        Seat seat = seatRepository.findByFlightAndSeatName(flight, seatName)
                .orElseThrow(() -> new SeatNotFoundException("Seat not found"));

        if (seat.isBooked()) {
            throw new SeatAlreadyBookedException("Seat is already booked");
        }

        seat.setBooked(true);

        return seatRepository.save(seat);
    }

}
