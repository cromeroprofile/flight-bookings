package com.flightbookings.flight_bookings.initializer;

import com.flightbookings.flight_bookings.services.interfaces.SeatService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SeatInitializer implements CommandLineRunner {

    private final SeatService seatService;

    public SeatInitializer(SeatService seatService) {
        this.seatService = seatService;
    }

    @Override
    public void run(String... args) throws Exception {
        seatService.initializeSeatsForAllFlights();
    }
}