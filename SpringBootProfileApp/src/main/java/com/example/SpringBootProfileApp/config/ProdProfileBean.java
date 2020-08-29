package com.example.SpringBootProfileApp.config;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("prod")
public class ProdProfileBean implements EnvBasedconfig {

	@Override
	public void setup() {
	System.out.println("Prod Config setup");

	}

}
