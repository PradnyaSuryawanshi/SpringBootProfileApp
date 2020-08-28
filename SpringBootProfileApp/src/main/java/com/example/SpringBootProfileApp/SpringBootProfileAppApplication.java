package com.example.SpringBootProfileApp;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootProfileAppApplication implements CommandLineRunner{

	@Autowired
	private DataSource datasource;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootProfileAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("DataSource: " +datasource);
	}

}
