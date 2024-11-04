package com.flightbookings.flight_bookings.exceptions;

/**
 * Exception thrown when a booking cannot be found.
 */
public final class BookingNotFoundException extends DomainError {
    /**
     * Constructs a new BookingNotFoundException with the specified detail message.
     *
     * @param message the detail message.
     */
    public BookingNotFoundException(String message) {
        super(message);
    }

    /**
     * Constructs a new BookingNotFoundException with the specified detail message and cause.
     *
     * @param message the detail message.
     * @param cause   the cause of the exception.
     */
    public BookingNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
