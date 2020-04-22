package com.miniproject.Mission1;

import java.util.List;

public interface IPersonService {
    List<Person> getAll();

    Person getById(int id);

    Person insertPerson(Person person);
}
