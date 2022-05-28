package ca.cgi.fsa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ca.cgi.fsa.entities.City;

public interface CityRepository extends JpaRepository<City, Long> {

}
