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

    @RequestMapping(value = "/person", method = RequestMethod.GET)
    public List<Person> getAll(){
        List<Person> personList = personService.getAll();
        return personList;
    }
}
