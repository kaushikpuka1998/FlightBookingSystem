package com.example.FlightBookingSystem.ENTITIES;

import jakarta.persistence.*;

@Entity
public class Passenger {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String email;

    @ManyToOne
    @JoinColumn(name="booking_id")
    private Booking booking;

    @ManyToOne
    @JoinColumn(name="user_id")
    private User user;
}
