package com.example.ej5.profiles;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}

//   mvn clean package -D spring-boot.run.jvmArguments="-Dspring.profiles.active=local"