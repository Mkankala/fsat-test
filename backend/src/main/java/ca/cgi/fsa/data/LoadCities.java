package ca.cgi.fsa.data;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import ca.cgi.fsa.entities.City;
import ca.cgi.fsa.repositories.CityRepository;

@Configuration
class LoadDatabase {

    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(CityRepository repository) {

        return args -> {
            log.info("Preloading " + repository.save(new City("Powell River")));
            log.info("Preloading " + repository.save(new City("Victoria")));
        };
    }
}