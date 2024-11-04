package com.flightbookings.flight_bookings.controllers;



import com.flightbookings.flight_bookings.dtos.airport.AirportConverter;
import com.flightbookings.flight_bookings.models.AirportEntity;
import com.flightbookings.flight_bookings.services.JwtService;
import com.flightbookings.flight_bookings.services.interfaces.AirportService;
import org.instancio.Instancio;
import org.instancio.InstancioApi;
import org.instancio.Select;
import org.instancio.settings.Settings;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Import;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.Arrays;
import java.util.List;

import static org.instancio.settings.Keys.FAIL_ON_ERROR;
import static org.instancio.settings.Keys.MAX_DEPTH;
import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.header;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

@WebMvcTest(AirportController.class)
@AutoConfigureMockMvc(addFilters = false)
@Import({AirportConverter.class,JwtService.class})
class AirportControllerSpringTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private AirportService airportService;


    @Test
    void shouldGetAllAirports() throws Exception {

        InstancioApi<AirportEntity> airportBuilder =  Instancio.of(AirportEntity.class)
                .withSettings(Settings.create().set(FAIL_ON_ERROR, true))
                .withSettings(Settings.create().set(MAX_DEPTH, 5))
                .set(Select.field(AirportEntity::getAirportCode), "MAD");

        AirportEntity airport1 = airportBuilder.create();
        AirportEntity airport2 = airportBuilder.create();
        List<AirportEntity> airports = Arrays.asList(airport1, airport2);

        given(airportService.getAllAirports()).willReturn(airports);

        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/airports/")
                        .header(HttpHeaders.ORIGIN, "http://anotherdomain.com")
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(header().string(HttpHeaders.ACCESS_CONTROL_ALLOW_ORIGIN, "*"))
                .andExpect(jsonPath("$.length()").value(airports.size())) //
                .andExpect(jsonPath("$[0].airportCode").value(airport1.getAirportCode()))
                .andExpect(jsonPath("$[0].airportName").value(airport1.getAirportName()))
                .andExpect(jsonPath("$[0].airportCity").value(airport1.getAirportCity()))
                .andExpect(jsonPath("$[0].airportCountry").value(airport1.getAirportCountry().toString()))
                .andExpect(jsonPath("$[1].airportCode").value(airport2.getAirportCode()))
                .andExpect(jsonPath("$[1].airportName").value(airport2.getAirportName()))
                .andExpect(jsonPath("$[1].airportCity").value(airport2.getAirportCity()))
                .andExpect(jsonPath("$[1].airportCountry").value(airport2.getAirportCountry().toString()));
        ;
    }
}


