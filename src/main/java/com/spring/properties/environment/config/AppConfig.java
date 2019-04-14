package com.spring.properties.environment.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import com.spring.properties.environment.Car;
import com.spring.properties.environment.User;

@Configuration
@ComponentScan(basePackages="com.spring.properties.environment")
@PropertySource("classpath:user.properties")
public class AppConfig {
	
	@Autowired
	private Car car;
	
	@Autowired
	private Environment env;
	
	@Bean
	public User user(){
		return new User(car, env.getProperty("name"), Integer.valueOf(env.getProperty("age")));
	}
}
