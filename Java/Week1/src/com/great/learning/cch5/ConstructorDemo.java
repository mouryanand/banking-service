package com.great.learning.cch5;

public class ConstructorDemo {
	public ConstructorDemo() {
		System.out.println("I am a default constructor.");
	}

	public ConstructorDemo(int a, float f, String s, char c) {
		System.out.println("\nI am Parameterized constructor.I take various argumentsas input.");
		System.out.println("The square of an Integer numberis: " + a * a);
		System.out.println("The square of a float numberis: " + f * f);
		System.out.println("The string you inputted is:" + s);
		System.out.println("The inputted character is: " + c);
	}

	public void observations() {
		System.out.println("inside Observations method");
	}

	public static void main(String[] args) {
		System.out.println("From Object creation method1");
		ConstructorDemo obj = new ConstructorDemo();
		ConstructorDemo obj1 = new ConstructorDemo(5, 0.5f, "hello learner", 'z');
		System.out.println("\nFrom Object creation method2");
		ConstructorDemo obj2, obj3;
		obj2 = new ConstructorDemo();
		obj3 = new ConstructorDemo(15, 2.5f, "hi learner", 'w');
		obj.observations();
	}
}
