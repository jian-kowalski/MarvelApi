package com.jiankowalski.marvel.domain.service;

import java.util.List;

import com.jiankowalski.marvel.domain.model.Character;
import com.jiankowalski.marvel.domain.model.Comic;
import com.jiankowalski.marvel.domain.repository.ComicRepository;

import org.springframework.stereotype.Service;

@Service
public class ComicServiceImpl implements ComicService {

    private final ComicRepository comicRepository;
    

    public ComicServiceImpl(ComicRepository comicRepository) {
        this.comicRepository = comicRepository;
    }


    @Override
    public List<Comic> findByCharacter(Character character) {
        return comicRepository.findByCharacter(character);
    }
    
}
