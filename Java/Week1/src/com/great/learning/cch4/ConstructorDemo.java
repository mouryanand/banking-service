package com.great.learning.cch4;

public class ConstructorDemo {

	public ConstructorDemo() {
		System.out.println("Good Day Learners!. This isHarshit and I am 25 yearsold.\n" + "I am from Uttar Pradesh "
				+ "Happy Learning!!!");
	}

	public ConstructorDemo(String name, int age, String location) {
		System.out.println("\n\nGood Day Learners!. This is " + name + " and I am " + age + " years old.\n"
				+ "I am from " + location + " Happy Learning");
		}

	public static void main(String[] args) {
		ConstructorDemo constructorDemo;
		constructorDemo = new ConstructorDemo();
		constructorDemo = new ConstructorDemo("Harshit", 25, " Uttar Pradesh");
	}

}
