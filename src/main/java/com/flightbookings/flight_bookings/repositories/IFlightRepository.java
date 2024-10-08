package com.flightbookings.flight_bookings.repositories;

import com.flightbookings.flight_bookings.models.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 * Repository interface for managing {@link Flight} entities.
 * Provides basic CRUD operations through JpaRepository.
 */
public interface IFlightRepository extends JpaRepository<Flight, Long> {
}
