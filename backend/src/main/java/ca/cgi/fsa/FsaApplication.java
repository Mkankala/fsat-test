package ca.cgi.fsa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class FsaApplication {

	@RequestMapping("/")
	public String home() {
		return "Hello Docker World";
	}

	// @GetMapping("/cities")
	// public String cities() {
	// return "All the cities";
	// }

	public static void main(String[] args) {
		SpringApplication.run(FsaApplication.class, args);
	}

}