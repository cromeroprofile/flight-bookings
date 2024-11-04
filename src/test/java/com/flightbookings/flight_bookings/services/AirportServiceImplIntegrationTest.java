package com.flightbookings.flight_bookings.services;


import com.flightbookings.flight_bookings.models.AirportEntity;
import com.flightbookings.flight_bookings.repositories.IAirportRepository;
import com.flightbookings.flight_bookings.services.interfaces.AirportService;
import org.instancio.Instancio;
import org.instancio.Select;
import org.instancio.settings.Settings;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.transaction.annotation.Transactional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.instancio.settings.Keys.FAIL_ON_ERROR;
import static org.instancio.settings.Keys.MAX_DEPTH;

@SpringBootTest
@ActiveProfiles("test")
@Transactional
class AirportServiceImplIntegrationTest {

    @Autowired
    private AirportService airportService;

    @Autowired
    private IAirportRepository airportRepository;

    @Test
    void createAirport_ShouldSaveAndReturnAirport() {
        AirportEntity airport =  Instancio.of(AirportEntity.class)
                .withSettings(Settings.create().set(FAIL_ON_ERROR, true))
                .withSettings(Settings.create().set(MAX_DEPTH, 5))
                .set(Select.field(AirportEntity::getAirportCode), "MAD")
                .create();

        AirportEntity savedAirport = airportService.createAirport(airport);

        assertThat(savedAirport).isNotNull();
        assertThat(savedAirport.getAirportCode()).isEqualTo(airport.getAirportCode());
        assertThat(savedAirport.getAirportName()).isEqualTo(airport.getAirportName());
        assertThat(savedAirport.getAirportCity()).isEqualTo(airport.getAirportCity());
        assertThat(savedAirport.getAirportCountry()).isEqualTo(airport.getAirportCountry());

        AirportEntity foundAirport = airportRepository.findById(savedAirport.getAirportCode()).orElse(null);
        assertThat(foundAirport).isNotNull();
        assertThat(foundAirport.getAirportCode()).isEqualTo(airport.getAirportCode());
        assertThat(foundAirport.getAirportName()).isEqualTo(airport.getAirportName());
        assertThat(foundAirport.getAirportCity()).isEqualTo(airport.getAirportCity());
        assertThat(foundAirport.getAirportCountry()).isEqualTo(airport.getAirportCountry());
    }
}