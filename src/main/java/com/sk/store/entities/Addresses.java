package com.sk.store.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
public class Addresses {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "street")
    private String street;

    @Column(name = "city")
    private String city;

    @Column(name = "state")
    private String state;

    @Column(nullable = false, name = "zip")
    private String zip;
}
