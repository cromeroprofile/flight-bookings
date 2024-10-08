package com.flightbookings.flight_bookings.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
/**
 * Represents a flight entity in the system.
 * Contains details such as the flight number, departure and arrival times, airplane type, and associated seats and bookings.
 */
@Entity
@Table(name = "flight")
@Schema(description = "All details about the Flight entity.")
public class Flight {

    /**
     * The unique identifier of the flight generated by the database.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Schema(description = "The database generated flight ID")
    private Long flightId;

    /**
     * The flight number.
     */
    @Schema(description = "Flight number")
    @Column
    private int flightNumber;

    /**
     * The number of rows in the airplane for this flight.
     */
    @Schema(description = "Number of rows in the airplane")
    @Column
    private int numRows;

     /**
     * The time when the flight departs.
     */
    @Schema(description = "Time of departure")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy HH:mm:ss")
    @Column
    private LocalDateTime departureTime;

    /**
     * The time when the flight arrives.
     */
    @Schema(description = "Time of arrival")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy HH:mm:ss")
    @Column
    private LocalDateTime arrivalTime;

    @Schema(description = "Duration of the flight")
    @Column
    private Duration flightDuration;

    /**
     * The type of airplane used for this flight.
     */
    @Schema(description = "Type of airplane used for the flight")
    @Column
    private EFlightAirplane flightAirplane;

    /**
     * The capacity of the airplane.
     */
    @Schema(description = "Capacity of the airplane")
    @Column
    private int capacityPlane;

    /**
     * The availability status of the flight.
     */
    @Schema(description = "Availability status of the flight")
    @Column
    private boolean availability;

    /**
     * The price of the flight.
     */
    @Schema(description = "Price of the flight")
    @Column
    private BigDecimal flightPrice;

    /**
     * List of seats associated with this flight.
     */
    @OneToMany(mappedBy = "flight", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference(value = "flight-seat")
    @Schema(description = "List of seats associated with this flight.")
    private List<Seat> seats = new ArrayList<>();

    /**
     * List of bookings associated with this flight.
     */
    @OneToMany(mappedBy = "flight", cascade = CascadeType.ALL)
    @JsonManagedReference(value = "booking-flight")
    @Schema(description = "List of bookings associated with this flight.")
    private List<Booking> bookingList;

    /**
     * List of airport origin associated with this flight.
     */

    private String originAirport;

    /**
     * List of airport destination associated with this flight.
     */

    private String destinationAirport;

    /**
     * Default constructor for Flight.
     */
    public Flight() {
    }
    /**
     * Constructs a new Flight with the specified details.
     *
     * @param flightId            The flight ID.
     * @param flightNumber  The flight number.
     * @param departureTime The departure time.
     * @param arrivalTime   The arrival time.
     * @param flightAirplane The airplane type.
     * @param capacityPlane The seating capacity of the airplane.
     * @param availability  The availability status.
     * @param numRows       The number of rows.
     * @param flightPrice   The price of the flight.
     * @param seats      The list of seats.
     * @param bookingList   The list of bookings.
     */

    public Flight(Long flightId, int flightNumber, int numRows, LocalDateTime departureTime, LocalDateTime arrivalTime, Duration flightDuration, EFlightAirplane flightAirplane, int capacityPlane, boolean availability, BigDecimal flightPrice, List<Seat> seats, List<Booking> bookingList, String originAirport, String destinationAirport) {
        this.flightId = flightId;
        this.flightNumber = flightNumber;
        this.numRows = numRows;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.flightDuration = flightDuration;
        this.flightAirplane = flightAirplane;
        this.capacityPlane = capacityPlane;
        this.availability = availability;
        this.flightPrice = flightPrice;
        this.seats = seats;
        this.bookingList = bookingList;
        this.originAirport = originAirport;
        this.destinationAirport = destinationAirport;
    }

    public String getOriginAirport() {
        return originAirport;
    }

    public void setOriginAirport(String originAirport) {
        this.originAirport = originAirport;
    }

    public String getDestinationAirport() {
        return destinationAirport;
    }

    public void setDestinationAirport(String destinationAirport) {
        this.destinationAirport = destinationAirport;
    }

    /**
     * Gets the flight ID.
     *
     * @return The flight ID.
     */
    public Long getFlightId() {
        return flightId;
    }

    /**
     * Sets the flight ID.
     *
     * @param flightId The flight ID.
     */
    public void setFlightId(Long flightId) {
        this.flightId = flightId;
    }

    /**
     * Gets the flight number.
     *
     * @return The flight number.
     */
    public int getFlightNumber() {
        return flightNumber;
    }

    /**
     * Sets the flight number.
     *
     * @param flightNumber The flight number.
     */
    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    /**
     * Gets the departure time.
     *
     * @return The departure time.
     */
    public LocalDateTime getDepartureTime() {
        return departureTime;
    }

    /**
     * Sets the departure time.
     *
     * @param departureTime The departure time.
     */
    public void setDepartureTime(LocalDateTime departureTime) {
        this.departureTime = departureTime;
    }
    /**
     * Gets the arrival time.
     *
     * @return The arrival time.
     */
    public LocalDateTime getArrivalTime() {
        return arrivalTime;
    }

    /**
     * Sets the arrival time.
     *
     * @param arrivalTime The arrival time.
     */
    public void setArrivalTime(LocalDateTime arrivalTime) {
        this.arrivalTime = arrivalTime;
    }
    /**
     * Gets the type of airplane used for the flight.
     *
     * @return The airplane type.
     */
    public EFlightAirplane getFlightAirplane() {
        return flightAirplane;
    }

    /**
     * Sets the type of airplane used for the flight.
     *
     * @param flightAirplane The airplane type.
     */
    public void setFlightAirplane(EFlightAirplane flightAirplane) {
        this.flightAirplane = flightAirplane;
    }

    /**
     * Gets the seating capacity of the airplane.
     *
     * @return The seating capacity.
     */
    public int getCapacityPlane() {
        return capacityPlane;
    }

    /**
     * Sets the seating capacity of the airplane.
     *
     * @param capacityPlane The seating capacity.
     */
    public void setCapacityPlane(int capacityPlane) {
        this.capacityPlane = capacityPlane;
    }

    /**
     * Gets the availability status of the flight.
     *
     * @return True if the flight is available, false otherwise.
     */
    public boolean isAvailability() {
        return availability;
    }

    /**
     * Sets the availability status of the flight.
     *
     * @param availability The availability status.
     */
    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public int getNumRows() {
        return numRows;
    }

    public void setNumRows(int numRows) {
        this.numRows = numRows;
    }

    /**
     * Gets the price of the flight.
     *
     * @return The flight price.
     */
    public BigDecimal getFlightPrice() {
        return flightPrice;
    }

    /**
     * Sets the price of the flight.
     *
     * @param flightPrice The flight price.
     */
    public void setFlightPrice(BigDecimal flightPrice) {
        this.flightPrice = flightPrice;
    }

    /**
     * Gets the list of seats associated with this flight.
     *
     * @return The list of seats.
     */
    public List<Seat> getSeats() {
        return seats;
    }

    /**
     * Sets the list of seats for this flight.
     *
     * @param seats The list of seats.
     */
    public void setSeats(List<Seat> seats) {
        this.seats = seats;
    }

    /**
     * Gets the list of bookings associated with this flight.
     *
     * @return The list of bookings.
     */
    public List<Booking> getBookingList() {
        return bookingList;
    }

    /**
     * Sets the list of bookings associated with this flight.
     *
     * @param bookingList The list of bookings.
     */
    public void setBookingList(List<Booking> bookingList) {
        this.bookingList = bookingList;
    }








    public Duration getFlightDuration() { // Método getter para flightDuration
        return flightDuration;
    }

    public void setFlightDuration(Duration flightDuration) { // Método setter para flightDuration
        this.flightDuration = flightDuration;
    }
}

//    public Set<Airport> getAirports() {
//        return airports;
//    }
//
//    public void setAirports(Set<Airport> airports) {
//        this.airports = airports;
//    }
