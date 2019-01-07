package com.felix.springit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.felix.springit.config.SpringProperties;

@SpringBootApplication
@EnableConfigurationProperties(SpringProperties.class)
public class SpringitApplication {


	public static void main(String[] args) {
		SpringApplication.run(SpringitApplication.class, args);
	}
}