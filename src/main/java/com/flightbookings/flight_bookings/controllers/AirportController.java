package com.flightbookings.flight_bookings.controllers;

import com.flightbookings.flight_bookings.dtos.airport.AirportConverter;
import com.flightbookings.flight_bookings.dtos.airport.AirportDTO;
import com.flightbookings.flight_bookings.models.AirportEntity;
import com.flightbookings.flight_bookings.services.interfaces.AirportService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Controller for managing airports, including retrieving and creating airports.
 */
@CrossOrigin("*")
@RestController
@RequestMapping("/api/v1/airports")
@Tag(name = "Airport Management", description = "Operations pertaining to airport management")
@RequiredArgsConstructor
public class AirportController {
    private final AirportService airportService;
    private final AirportConverter airportConverter;

    /**
     * Retrieves all airports.
     *
     * @return a list of all airports.
     */
    @Operation(summary = "Get all airports")
    @GetMapping("/")
    public ResponseEntity<List<AirportDTO>> getAllAirports() {
        // never use the same dto of entities when result must return only pojo objects!!!!
        List<AirportDTO> airports = airportService.getAllAirports()
                .stream().map(airportConverter::mapToAirportDTO).toList();
        return new ResponseEntity<>(airports, HttpStatus.OK);
    }

    /**
     * Creates a new airport.
     *
     * @param airport the airport object to be created.
     * @return the created airport.
     */
    @Operation(summary = "Create a new airport")
    @PostMapping("/create")
    public ResponseEntity<AirportEntity> createAirport(@RequestBody AirportEntity airport) {
        AirportEntity createdAirport = airportService.createAirport(airport);
        return new ResponseEntity<>(createdAirport, HttpStatus.CREATED);
    }
}
