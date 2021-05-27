package com.jiankowalski.marvel.domain.repository;
import com.jiankowalski.marvel.domain.model.Character;

import org.springframework.data.jpa.repository.JpaRepository;
public interface CharacterRepository extends JpaRepository<Character, Long>{ 
    

}
