package com.miniproject.Mission1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService implements IPersonService {

    private PersonRepository personRepository;

    @Autowired
    private void PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public List<Person> getAll() {
        return this.personRepository.findAll();
    }

    @Override
    public Person getById(int id) {
        return personRepository.findById(id);
    }

    @Override
    public Person insertPerson(Person person) {
        return this.personRepository.save(person);
    }
}
