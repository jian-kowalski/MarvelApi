package com.jiankowalski.marvel.domain.repository;

import java.util.List;

import com.jiankowalski.marvel.domain.model.Character;
import com.jiankowalski.marvel.domain.model.Event;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, Long> {

    List<Event> findByCharacter(Character character);

}
