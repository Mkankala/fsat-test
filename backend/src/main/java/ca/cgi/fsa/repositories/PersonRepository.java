package ca.cgi.fsa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ca.cgi.fsa.entities.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {

}
