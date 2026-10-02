package com.sk.store.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
public class Tags {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "name")
    private String name;
}
;