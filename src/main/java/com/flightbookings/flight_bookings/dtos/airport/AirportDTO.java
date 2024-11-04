package com.flightbookings.flight_bookings.dtos.airport;

import com.flightbookings.flight_bookings.models.ECountry;

public record AirportDTO (String airportCode, String airportName, String airportCity, ECountry airportCountry
) {
}
