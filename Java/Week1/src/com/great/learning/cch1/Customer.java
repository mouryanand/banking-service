package com.great.learning.cch1;

public class Customer {
	private String fullName;
	private int age;
	
	public Customer(String fullName, int age) {
		super();
		this.fullName = fullName;
		this.age = age;
	}

	public String getFullName() {
		return fullName;
	}

	public int getAge() {
		return age;
	}	
}
