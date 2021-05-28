package com.jiankowalski.marvel.domain.repository;
import com.jiankowalski.marvel.domain.model.Character;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
public interface CharacterRepository extends JpaRepository<Character, Long>, 
    JpaSpecificationExecutor<Character>{ 
    

}
