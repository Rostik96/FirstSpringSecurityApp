package com.personal.rost.FirstSecurityApp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.personal.rost.FirstSecurityApp.models.Person;

@Repository
public interface PeopleRepository extends JpaRepository<Person, Integer> {

}
