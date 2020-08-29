package com.example.SpringBootProfileApp;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.SpringBootProfileApp.config.EnvBasedconfig;

@SpringBootApplication
public class SpringBootProfileAppApplication implements CommandLineRunner{

	@Autowired
	private DataSource datasource;
	
	@Autowired
	private EnvBasedconfig envBasedconfig;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootProfileAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("--------------------------------------------");
		System.out.println("DataSource: " +datasource);
		
		System.out.println("--------------------------------------------");
		envBasedconfig.setup();
	}

}
