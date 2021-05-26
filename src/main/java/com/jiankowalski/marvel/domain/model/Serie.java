package com.jiankowalski.marvel.domain.model;

import java.time.OffsetDateTime;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
public class Serie{
    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String title;
    private String description;
    private String resourceURI;
    private Integer startYear;
    private Integer endYear;
    private String rating;

    @UpdateTimestamp
    private OffsetDateTime modified;

    @Embedded
    private Thumbnail thumbnail;

    @ManyToMany
    @JoinTable(name = "serie_urls", joinColumns =
    @JoinColumn(name = "urls_id"),
        inverseJoinColumns = @JoinColumn(name = "serie_id"))
    private Set<Url> urls = new HashSet<>();

    @ManyToOne
    private Character character; 
}