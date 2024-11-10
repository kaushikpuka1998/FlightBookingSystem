package com.example.FlightBookingSystem.ENTITIES;

import jakarta.persistence.*;

@Entity
public class Seat {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String seatNumber;
    private String seatType;
    private boolean isAvailable;

    @ManyToOne
    @JoinColumn(name="flight_id")
    private Flight flight;
}
