package com.jiankowalski.marvel.domain.service;

import java.util.List;

import com.jiankowalski.marvel.domain.model.Character;
import com.jiankowalski.marvel.domain.model.Story;

import org.springframework.stereotype.Service;

@Service
public interface StoryService {
    List<Story> findByCharacter(Character character); 
}
