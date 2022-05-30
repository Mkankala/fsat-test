package ca.cgi.fsa.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import ca.cgi.fsa.entities.Person;
import ca.cgi.fsa.repositories.PersonRepository;

@RestController
public class PersonController {
    private PersonRepository People;

    public PersonController(PersonRepository people) {
        this.People = people;
    }

    @GetMapping("/people")
    public List<Person> getPeople() {
        return People.findAll();
    }

    @DeleteMapping("/person/{}")
    public List<Person> deletePeople(@PathVariable Long id) {
        People.deleteById(id);
        return People.findAll();
    }

}
