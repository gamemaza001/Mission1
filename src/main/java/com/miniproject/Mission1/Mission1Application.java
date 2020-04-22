package com.miniproject.Mission1;

import org.flywaydb.core.Flyway;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Mission1Application {

	public static void main(String[] args) {
		SpringApplication.run(Mission1Application.class, args);
		// Flyway flyway = Flyway.configure().dataSource("jdbc:postgresql://192.168.99.100:5432/postgres", "user", "password123").load();
		// Start the migration
		// flyway.migrate();
	}

}
