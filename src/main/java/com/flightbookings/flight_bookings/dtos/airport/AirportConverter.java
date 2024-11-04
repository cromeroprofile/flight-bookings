package com.flightbookings.flight_bookings.dtos.airport;

import com.flightbookings.flight_bookings.models.AirportEntity;
import org.springframework.stereotype.Component;

@Component
public class AirportConverter {

    public  AirportDTO mapToAirportDTO(AirportEntity entity) {
        return new AirportDTO(
                entity.getAirportCode(),
                entity.getAirportName(),
                entity.getAirportCity(),
                entity.getAirportCountry()
        );
    }


}
