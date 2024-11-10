package com.example.FlightBookingSystem.ENTITIES;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Schedule {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private LocalDateTime departureTime;
    private LocalDateTime arrivalTime;


    @ManyToOne
    @JoinColumn(name="flight_id")
    private Flight flight;

    @OneToMany(mappedBy="schedule")
    List<Booking> bookingList;
}
