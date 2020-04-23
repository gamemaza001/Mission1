package com.miniproject.Mission1.Services;

import com.miniproject.Mission1.Models.Person;
import com.miniproject.Mission1.Repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
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
        return personRepository.findAll();
    }

    @Override
    public Person getById(int id) {
        return personRepository.findById(id);
    }

    @Override
    public Person insertPerson(Person person) {
        return personRepository.save(person);
    }

    @Override
    public boolean deletePerson(Person person) {
        try {
            personRepository.delete(person);
            return true;
        } catch (EmptyResultDataAccessException e) {
            return false;
        }
    }

    @Override
    public boolean updatePerson(Person person) {
        try {
            personRepository.save(person);
            return true;
        } catch (EmptyResultDataAccessException e) {
            return false;
        }

    }
}
