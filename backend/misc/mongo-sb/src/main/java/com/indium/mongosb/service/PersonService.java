package com.indium.mongosb.service;

import com.indium.mongosb.document.Person;
import com.indium.mongosb.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    @Transactional
    public void savePerson(Person person) {
        personRepository.save(person);
    }

    public List<Person> loadAllPersons() {
        //return personRepository.findAll();
        return personRepository.getAllPersons();
    }
}
