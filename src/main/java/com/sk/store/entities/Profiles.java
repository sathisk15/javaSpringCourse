package com.sk.store.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Getter
@Setter
public class Profiles {
    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "bio")
    private String bio;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "loyalty_points")
    private String loyaltyPoints;

    @Column(name = "date_of_birth")
    private LocalDate dateOfBirth;
}
