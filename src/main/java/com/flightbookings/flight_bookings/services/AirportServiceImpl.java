package com.flightbookings.flight_bookings.services;

import com.flightbookings.flight_bookings.models.Airport;
import com.flightbookings.flight_bookings.repositories.IAirportRepository;
import com.flightbookings.flight_bookings.services.interfaces.AirportService;

import java.util.List;
import java.util.Optional;


public class AirportServiceImpl implements AirportService {

    private final IAirportRepository airportRepository;

    public AirportServiceImpl(IAirportRepository airportRepository) {
        this.airportRepository = airportRepository;
    }
    public Airport createAirport(Airport airport){
        return airportRepository.save(airport);
    }

    public Airport upsateAirpot(Airport airport, Long id){
        airport.setAirportId(id);
        return airportRepository.save(airport);
    }

    public List<Airport> getAllAirports(){
        return airportRepository.findAll();
    }

    public Optional<Airport> getAirpotById (Long id){
        Optional<Airport> airport = airportRepository.findById(id);
        return airport.orElse(null);
    }
}
