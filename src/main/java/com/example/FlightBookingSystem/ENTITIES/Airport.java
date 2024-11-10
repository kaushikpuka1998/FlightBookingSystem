package com.example.FlightBookingSystem.ENTITIES;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Airport {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    String name;
    private String city;
    private String country;

    @OneToMany(mappedBy="departureAirport")
    List<Flight> departureFlights;

    @OneToMany(mappedBy="arrivalAirport")
    List<Flight> arrivalFlights;
}
