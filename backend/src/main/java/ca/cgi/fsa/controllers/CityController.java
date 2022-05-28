package ca.cgi.fsa.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import ca.cgi.fsa.entities.City;
import ca.cgi.fsa.repositories.CityRepository;

@RestController
public class CityController {
    public CityRepository Cities;

    public CityController(CityRepository cities) {
        this.Cities = cities;
    }

    @GetMapping("/cities")
    public List<City> getCities() {
        return Cities.findAll();
    }

    @DeleteMapping("/city/{id}")
    public List<City> deleteCat(@PathVariable Long id) {
        Cities.deleteById(id);
        return Cities.findAll();
    }

}
