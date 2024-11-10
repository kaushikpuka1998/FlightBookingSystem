package com.example.FlightBookingSystem.ENTITIES;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Flight {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String flightNumber;

    @ManyToOne
    @JoinColumn(name="departureAirport_id")
    private Airport departureAirport;

    @ManyToOne
    @JoinColumn(name="arrivalAirport_id")
    private Airport arrivalAirport;

    @ManyToOne
    @JoinColumn(name="company_id")
    private Company company;

    @OneToMany(mappedBy="flight")
    List<Schedule> scheduleList;

    @OneToMany(mappedBy="flight")
    List<Seat> seatList;

}
