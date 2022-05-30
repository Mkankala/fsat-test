package ca.cgi.fsa.data;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import ca.cgi.fsa.entities.City;
import ca.cgi.fsa.entities.Person;
import ca.cgi.fsa.repositories.CityRepository;
import ca.cgi.fsa.repositories.PersonRepository;

@Configuration
class LoadDatabase {

    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(CityRepository cityRepository, PersonRepository PersonRepository) {

        return args -> {
            // Load Citites
            log.info("Preloading " + cityRepository.save(new City("Powell River")));
            log.info("Preloading " + cityRepository.save(new City("Victoria")));

            // Load Persons
            log.info("Preloading " + PersonRepository.save(new Person("Greg", "Pascucci", "greg.pascucci@cgi.com")));
            log.info(
                    "Preloading " + PersonRepository.save(new Person("Conan", "Barbarian", "greg.pascucci@gmail.com")));
        };
    }
}