package com.jiankowalski.marvel.domain.model;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
public class Character {

    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Column(length = 500)
    private String description;

    @UpdateTimestamp
    private OffsetDateTime modified;

    @Embedded
    private Thumbnail thumbnail;

    @OneToMany(mappedBy = "character")
    private List<Comic> comics = new ArrayList<>();

    @OneToMany(mappedBy = "character")
    private List<Event> events = new ArrayList<>();

    @OneToMany(mappedBy = "character")
    private List<Serie> series = new ArrayList<>();

    @OneToMany(mappedBy = "character")
    private List<Story> storys = new ArrayList<>();
}
