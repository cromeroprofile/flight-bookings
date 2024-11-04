package com.flightbookings.flight_bookings.exceptions;

/**
 * Exception thrown when a resource cannot be found.
 */
public final class ResourceNotFoundException extends DomainError {
    /**
     * Constructs a new ResourceNotFoundException with the specified detail message.
     *
     * @param message the detail message.
     */
    public ResourceNotFoundException(String message) {
        super(message);
    }
}
