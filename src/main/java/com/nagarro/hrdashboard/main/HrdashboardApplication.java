package com.nagarro.hrdashboard.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * This is the Main class
 * 
 * @author varunrawat
 *
 */
@SpringBootApplication
@ComponentScan("com.*")
public class HrdashboardApplication {

	public static void main(final String[] args) {
		SpringApplication.run(HrdashboardApplication.class, args);
	}
}
