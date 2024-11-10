package com.example.FlightBookingSystem.ENTITIES;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;

    @OneToMany(mappedBy="company")
    List<Flight> flightslist;
}
