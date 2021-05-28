package com.jiankowalski.marvel.api.assembler;

import java.util.List;
import java.util.stream.Collectors;

import com.jiankowalski.marvel.api.model.EventModel;
import com.jiankowalski.marvel.domain.model.Event;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class EventModelAssembler {
    
    public EventModel toModel(Event event) {
        var modelMapper = new ModelMapper();
        return modelMapper.map(event, EventModel.class);
    }

    public List<EventModel> toCollectionModel(List<Event> events) {
        return events.stream().map(this::toModel).collect(Collectors.toList());
    }
}
