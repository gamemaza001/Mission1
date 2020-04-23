package com.miniproject.Mission1.Controllers;

import com.miniproject.Mission1.Models.Person;
import com.miniproject.Mission1.Services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonController {
    private final PersonService personService;

    @Autowired
    public PersonController(PersonService personService){
        this.personService = personService;
    }

    @RequestMapping(value = "/api/v1", method = RequestMethod.GET)
    public List<Person> getAll(){
        List<Person> personList = personService.getAll();
        return personList;
    }

    @RequestMapping(value = "/api/v1/{id}",method = RequestMethod.GET)
    public Person getById(@PathVariable(value = "id")int id){
        System.out.println("ID = " + id);
        return personService.getById(id);
    }

    @RequestMapping(value = "/api/v1",method = RequestMethod.POST)
    public ResponseEntity<?> create(@RequestBody Person person){
        System.out.println(person.toString());
        Person p = personService.insertPerson(person);
        return new ResponseEntity<Person>(p, HttpStatus.OK);
    }

    @RequestMapping(value = "/api/v1/{id}",method = RequestMethod.DELETE)
    public boolean deleteById(@PathVariable(value = "id")int id){
        Person person = personService.getById(id);
        return personService.deletePerson(person);
    }
}
