package com.flightbookings.flight_bookings.exceptions;

/**
 * Exception thrown when a flight cannot be found.
 */
public final class FlightNotFoundException extends DomainError {

    /**
     * Constructs a new FlightNotFoundException with the specified detail message.
     *
     * @param message the detail message.
     */
    public FlightNotFoundException(String message) {
        super(message);
    }

    /**
     * Constructs a new FlightNotFoundException with the specified detail message and cause.
     *
     * @param message the detail message.
     * @param cause   the cause of the exception.
     */
    public FlightNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
