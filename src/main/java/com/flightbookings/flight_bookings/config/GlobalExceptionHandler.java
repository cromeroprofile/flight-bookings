package com.flightbookings.flight_bookings.config;

import com.flightbookings.flight_bookings.exceptions.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

import static org.springframework.http.HttpStatus.*;

@RestControllerAdvice
public class GlobalExceptionHandler {

    // Manejar excepciones específicas del dominio
    @ExceptionHandler(DomainError.class)
    public ResponseEntity<Map<String, Object>> handleDomainError(DomainError ex) {
        Map<String, Object> errorResponse = new HashMap<>();

        return switch (ex) {
            case BookingNotFoundException e -> {
                errorResponse.put("error", "Booking not found");
                errorResponse.put("message", e.getMessage());
                yield new ResponseEntity<>(errorResponse, NOT_FOUND);
            }
            case FlightNotFoundException e -> {
                errorResponse.put("error", "Flight not found");
                errorResponse.put("message", e.getMessage());
                yield new ResponseEntity<>(errorResponse, NOT_FOUND);
            }
            case NoSeatAssignedException e -> {
                errorResponse.put("error", "No seat assigned");
                errorResponse.put("message", e.getMessage());
                yield new ResponseEntity<>(errorResponse, BAD_REQUEST);
            }
            case PassengerNotFoundException e -> {
                errorResponse.put("error", "Passenger not found");
                errorResponse.put("message", e.getMessage());
                yield new ResponseEntity<>(errorResponse, NOT_FOUND);
            }
            case ResourceNotFoundException e -> {
                errorResponse.put("error", "Resource not found");
                errorResponse.put("message", e.getMessage());
                yield new ResponseEntity<>(errorResponse, NOT_FOUND);
            }
            case SeatAlreadyBookedException e -> {
                errorResponse.put("error", "Seat already booked");
                errorResponse.put("message", e.getMessage());
                yield new ResponseEntity<>(errorResponse, CONFLICT);
            }
            case SeatNotFoundException e -> {
                errorResponse.put("error", "Seat not found");
                errorResponse.put("message", e.getMessage());
                yield new ResponseEntity<>(errorResponse, NOT_FOUND);
            }
            case UnauthorizedAccessException e -> {
                errorResponse.put("error", "Unauthorized access");
                errorResponse.put("message", e.getMessage());
                yield new ResponseEntity<>(errorResponse, UNAUTHORIZED);
            }
            case UserNotFoundException e -> {
                errorResponse.put("error", "User not found");
                errorResponse.put("message", e.getMessage());
                yield new ResponseEntity<>(errorResponse, NOT_FOUND);
            }

            default -> throw new IllegalStateException("Unexpected value: " + ex);
        };
    }

    // Manejar excepciones generales
    @ExceptionHandler(Exception.class)
    public ResponseEntity<Map<String, Object>> handleGeneralException(Exception ex) {
        Map<String, Object> errorResponse = new HashMap<>();
        errorResponse.put("error", "Internal Server Error");
        errorResponse.put("message", ex.getMessage());
        return new ResponseEntity<>(errorResponse, INTERNAL_SERVER_ERROR);
    }
}
