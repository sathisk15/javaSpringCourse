package com.sk.store.entities;

import jakarta.persistence.*;
import lombok.*;

import javax.swing.text.html.HTML;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name="users")
@ToString
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(nullable = false, name = "name")
    private String name;

    @Column(nullable = false, name = "email")
    private String email;

    @Column(nullable = false, name = "password")
    private String password;

    @OneToMany(mappedBy = "user")
    @Builder.Default
    private List<Addresses> addresses = new ArrayList<>();

    @ManyToMany
    @JoinTable(
            name = "user_tags",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "tag_id")
    )
    @Builder.Default
    private Set<Tags> tags = new HashSet<>();

    public void addAddress(Addresses address){
        addresses.add(address);
        address.setUser(this);
    }


    public void addTag(String tagName){
        var tag = new Tags(tagName);
        tag.getUsers().add(this);
        this.tags.add(tag);
    }
}
