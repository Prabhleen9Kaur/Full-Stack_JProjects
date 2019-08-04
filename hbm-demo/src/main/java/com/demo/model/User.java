package com.demo.model;

/**
 * @author prabhleen
 */

public class User {
	
	public User(String name, int age, double salary) {
		super();
		//we wont use id in this constructor as it will be autoincrement
	
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	
	
	private int id;
	private String name;
	private int age;
	private double salary;
	
	public User() {
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	

}
