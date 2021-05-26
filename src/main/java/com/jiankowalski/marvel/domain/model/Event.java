package com.jiankowalski.marvel.domain.model;

import java.time.OffsetDateTime;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;

import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
public class Event {

    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;
    private String resourceURI;

    @UpdateTimestamp
    private OffsetDateTime modified;
    private OffsetDateTime start;
    private OffsetDateTime end;

    @Embedded
    private Thumbnail thumbnail;

    @ManyToMany
    @JoinTable(name = "events_urls", joinColumns = @JoinColumn(name = "urls_id"), 
        inverseJoinColumns = @JoinColumn(name = "event_id"))
    private Set<Url> urls = new HashSet<>();

    @ManyToMany(mappedBy = "comics", cascade = CascadeType.ALL)
    private Set<Character> character;
}