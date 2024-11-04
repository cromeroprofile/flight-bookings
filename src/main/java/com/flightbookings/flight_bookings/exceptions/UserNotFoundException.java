package com.flightbookings.flight_bookings.exceptions;

/**
 * Exception thrown when a user cannot be found.
 */
public final class UserNotFoundException extends DomainError {
    /**
     * Constructs a new UserNotFoundException with the specified detail message.
     *
     * @param message the detail message.
     */
    public UserNotFoundException(String message) {
        super(message);
    }
}
