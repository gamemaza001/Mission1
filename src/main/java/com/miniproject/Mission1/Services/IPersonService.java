package com.miniproject.Mission1.Services;

import com.miniproject.Mission1.Models.Person;

import java.util.List;

public interface IPersonService {
    List<Person> getAll();

    Person getById(int id);

    Person insertPerson(Person person);

    boolean deletePerson(Person person);
}
