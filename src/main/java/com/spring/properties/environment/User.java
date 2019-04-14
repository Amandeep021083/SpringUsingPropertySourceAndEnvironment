package com.spring.properties.environment;

public class User {

	private Car car;
	private String name;
	private int age;

	public User(Car car, String name, int age) {
		super();
		this.car = car;
		this.name = name;
		this.age = age;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
