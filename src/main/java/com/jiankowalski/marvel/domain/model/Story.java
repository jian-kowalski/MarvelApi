package com.jiankowalski.marvel.domain.model;

import java.time.OffsetDateTime;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
public class Story {
    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String title;
    private String description;
    private String resourceURI;
    private String type;

    @UpdateTimestamp
    private OffsetDateTime modified;

    @Embedded
    private Thumbnail thumbnail;

    @ManyToMany(mappedBy = "comics", cascade = CascadeType.ALL)
    private Set<Character> character;
}