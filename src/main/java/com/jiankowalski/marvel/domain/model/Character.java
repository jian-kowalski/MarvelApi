package com.jiankowalski.marvel.domain.model;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
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

    // @OneToMany(fetch = FetchType.LAZY, mappedBy = "character", 
    //     orphanRemoval = true, cascade = CascadeType.MERGE)
    // @Fetch(FetchMode.SUBSELECT)
    // private List<Event> events = new ArrayList<>();

    // @OneToMany(fetch = FetchType.LAZY, mappedBy = "character", 
    //     orphanRemoval = true, cascade = CascadeType.MERGE)
    // @Fetch(FetchMode.SUBSELECT)
    // private List<Serie> series = new ArrayList<>();

    // @OneToMany(fetch = FetchType.LAZY, mappedBy = "character", 
    //     orphanRemoval = true, cascade = CascadeType.MERGE)
    // @Fetch(FetchMode.SUBSELECT)
    // private List<Story> stories = new ArrayList<>();
}