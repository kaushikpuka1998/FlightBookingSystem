package com.example.FlightBookingSystem.ENTITIES;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String email;
    private String password;

    @OneToMany(mappedBy="user")
    List<Booking> bookingList;

    @OneToMany(mappedBy ="user")
    List<Passenger> passengerList;
}
