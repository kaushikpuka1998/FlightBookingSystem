package com.example.FlightBookingSystem.ENTITIES;

import jakarta.persistence.*;

@Entity
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String paymentMethod;
    private String paymentStatus;
    private double amount;

    @OneToOne
    @JoinColumn(name="booking_id")
    private Booking booking;

}
