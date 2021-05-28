package com.jiankowalski.marvel.domain.service;

import java.util.List;

import com.jiankowalski.marvel.domain.model.Character;
import com.jiankowalski.marvel.domain.model.Serie;
import com.jiankowalski.marvel.domain.repository.SerieRepository;

import org.springframework.stereotype.Service;

@Service
public class SerieServiceImpl implements SerieService {

    private final SerieRepository serieRepository;

    public SerieServiceImpl(SerieRepository serieRepository) {
        this.serieRepository = serieRepository;
    }

    @Override
    public List<Serie> findByCharacter(Character character) {
        return serieRepository.findByCharacter(character);
    }
    
}
