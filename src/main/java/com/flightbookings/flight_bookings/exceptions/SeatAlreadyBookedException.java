package com.flightbookings.flight_bookings.exceptions;

/**
 * Exception thrown when a seat is already booked.
 */
public final class SeatAlreadyBookedException extends DomainError {
    /**
     * Constructs a new SeatAlreadyBookedException with the specified detail message.
     *
     * @param message the detail message.
     */
    public SeatAlreadyBookedException(String message) {
        super(message);
    }

    /**
     * Constructs a new SeatAlreadyBookedException with the specified detail message and cause.
     *
     * @param message the detail message.
     * @param cause   the cause of the exception.
     */
    public SeatAlreadyBookedException(String message, Throwable cause) {
        super(message, cause);
    }
}