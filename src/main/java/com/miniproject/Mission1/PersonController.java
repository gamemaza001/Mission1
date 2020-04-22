package com.miniproject.Mission1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

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
    public String create(@RequestBody Person person){
        System.out.println(person.toString());
        Person p = personService.insertPerson(person);
        // System.out.println(b.toString());
        return person.toString();
    }
}
