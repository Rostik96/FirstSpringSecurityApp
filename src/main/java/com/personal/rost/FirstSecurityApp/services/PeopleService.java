package com.personal.rost.FirstSecurityApp.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.personal.rost.FirstSecurityApp.models.Person;
import com.personal.rost.FirstSecurityApp.repositories.PeopleRepository;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class PeopleService {
    private final PeopleRepository peopleRepository;

    public List<Person> index() {
        return peopleRepository.findAll();
    }
}
