package com.example.FlightBookingSystem.ENTITIES;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private LocalDate bookingDate;
    private String bookingStatus;

    @ManyToOne
    @JoinColumn(name="schedule_id")
    private Schedule schedule;

    @ManyToOne
    @JoinColumn(name="seat_id")
    private Seat seat;

    @ManyToOne
    @JoinColumn(name="user_id")
    private User user;

    @OneToMany(mappedBy = "booking")
    private List<Passenger> passengerList;

    @OneToOne(mappedBy = "booking")
    private Payment payment;

}
