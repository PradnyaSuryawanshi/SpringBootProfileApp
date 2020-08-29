package com.example.SpringBootProfileApp.config;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("dev")
public class DevProfileBean implements EnvBasedconfig {

	@Override
	public void setup() {
		System.out.println("dev config is setup");

	}

}
