package com.spring.properties.environment.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.properties.environment.User;
import com.spring.properties.environment.config.AppConfig;

public class MainClass {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		User user = (User)context.getBean("user");
		System.out.println(user.getCar().getName());
		System.out.println(user.getCar().getCost());
		System.out.println(user.getName());
		System.out.println(user.getAge());
		
	}

}
