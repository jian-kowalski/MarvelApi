package com.jiankowalski.marvel.domain.model;

import java.time.OffsetDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

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
    private String resourceURI;

    @Embedded
    private Thumbnail thumbnail;
    
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "character_comic", joinColumns =
    @JoinColumn(name = "comic_id"),
        inverseJoinColumns = @JoinColumn(name = "character_id"))
    private List<Comic> comics;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "character_story", joinColumns =
    @JoinColumn(name = "story_id"),
        inverseJoinColumns = @JoinColumn(name = "character_id"))
    private List<Story> stories;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "character_event", joinColumns =
    @JoinColumn(name = "event_id"),
        inverseJoinColumns = @JoinColumn(name = "character_id"))
    private List<Event> events;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "character_serie", joinColumns =
    @JoinColumn(name = "serie_id"),
        inverseJoinColumns = @JoinColumn(name = "character_id"))
    private List<Serie> series;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "character_url", joinColumns =
    @JoinColumn(name = "urls_id"),
        inverseJoinColumns = @JoinColumn(name = "character_id"))
    private List<Url> urls;
}
