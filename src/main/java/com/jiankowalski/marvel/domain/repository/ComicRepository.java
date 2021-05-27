package com.jiankowalski.marvel.domain.repository;

import java.util.List;

import com.jiankowalski.marvel.domain.model.Character;
import com.jiankowalski.marvel.domain.model.Comic;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ComicRepository extends JpaRepository<Comic, Long> {

    List<Comic> findByCharacter(Character character);
    
}
