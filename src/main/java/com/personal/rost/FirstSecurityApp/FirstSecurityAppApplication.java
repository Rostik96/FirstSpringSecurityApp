package com.personal.rost.FirstSecurityApp;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.personal.rost.FirstSecurityApp.services.PeopleService;
import lombok.AllArgsConstructor;

@SpringBootApplication
@AllArgsConstructor
public class FirstSecurityAppApplication implements CommandLineRunner {
	private final PeopleService peopleService;

	public static void main(String[] args) {
		SpringApplication.run(FirstSecurityAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		peopleService.index().forEach(System.out::println);
	}
}
