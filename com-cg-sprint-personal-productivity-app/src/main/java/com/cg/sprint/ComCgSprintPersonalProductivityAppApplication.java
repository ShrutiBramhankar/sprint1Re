package com.cg.sprint;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

import com.cg.sprint.model.Todo;
import com.cg.sprint.model.AppUser;
import com.cg.sprint.repository.TodoRepository;
import com.cg.sprint.repository.AppUserRepository;

@SpringBootApplication
@EnableScheduling
public class ComCgSprintPersonalProductivityAppApplication {

	
	
	public static void main(String[] args) {
		System.out.println("Starting...");
		SpringApplication.run(ComCgSprintPersonalProductivityAppApplication.class, args);
		System.out.println("Ending...");
	}
	
}


