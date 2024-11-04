package com.flightbookings.flight_bookings.exceptions;

/**
 * Base sealed class for domain-specific exceptions.
 */
public sealed class DomainError extends RuntimeException permits BookingNotFoundException, FlightNotFoundException, NoSeatAssignedException, PassengerNotFoundException, ResourceNotFoundException, SeatAlreadyBookedException, SeatNotFoundException, UnauthorizedAccessException, UserNotFoundException {

    public DomainError(String message) {
        super(message);
    }

    public DomainError(String message, Throwable cause) {
        super(message, cause);
    }
}
