package com.jiankowalski.marvel.domain.repository;

import com.jiankowalski.marvel.domain.model.Story;

import java.util.List;

import com.jiankowalski.marvel.domain.model.Character;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StoryRepository extends JpaRepository<Story, Long> {
    List<Story> findByCharacter(Character character);   
}
