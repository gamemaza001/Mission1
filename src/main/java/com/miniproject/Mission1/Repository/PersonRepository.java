package com.miniproject.Mission1.Repository;

import com.miniproject.Mission1.Models.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
    List<Person> findAll();

    Person findById(int id);

    Person save(Person person);

}
