package com.jiankowalski.marvel.domain.service;

import java.util.List;

import com.jiankowalski.marvel.domain.model.Event;

import org.springframework.stereotype.Service;

import com.jiankowalski.marvel.domain.model.Character;

@Service
public interface EventService {
    List<Event> findByCharacter(Character character);
}
