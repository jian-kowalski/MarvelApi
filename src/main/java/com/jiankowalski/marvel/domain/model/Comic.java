package com.jiankowalski.marvel.domain.model;

import java.time.OffsetDateTime;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.JoinColumn;

import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
public class Comic {
    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer digitalId = 0;
    private String title;
    private Integer issueNumber;
    private String variantDescription;

    @Column(length = 1000)
    private String description;
    private String resourceURI;

    @UpdateTimestamp
    private OffsetDateTime modified;
    private String isbn;
    private String upc;
    private String diamondCode;
    private String ean;
    private String issn;
    private String format;
    private String pageCount;
    // private List<TextObject> textObjects = new ArrayList<>();

    // @ManyToMany
    // @JoinTable(name = "comic_url", joinColumns = @JoinColumn(name = "url_id"), 
    //     inverseJoinColumns = @JoinColumn(name = "comic_id"))
    // private Set<Url> urls = new HashSet<>();

    
    @ManyToMany(mappedBy = "comics", fetch = FetchType.EAGER)
    private List<Character> characters;
}
