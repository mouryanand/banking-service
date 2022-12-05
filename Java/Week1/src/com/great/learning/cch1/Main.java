package com.great.learning.cch1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter full name : ");
		String fullName = scanner.nextLine();
		System.out.println("Please enter your age : ");
		int age = scanner.nextInt();
		Customer customer = new Customer(fullName, age);
		System.out.println("Customer Name : "+customer.getFullName());
		System.out.println("Customer Age : "+customer.getAge());
	}

}
