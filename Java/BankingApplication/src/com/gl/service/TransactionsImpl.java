package com.gl.service;

import java.util.Scanner;

import com.gl.entity.Customer;
import com.gl.interfaces.Transaction;
import com.gl.util.OtpGenerator;

public class TransactionsImpl implements Transaction {
	private Customer customer;
	
	public TransactionsImpl(Customer customer) {
		super();
		this.customer = customer;
	}

	@Override
	public void deposit(double amount) {
		customer.setBalance(customer.getBalance() + amount);
		System.out.println("Current Balance of Customer : "+customer.getBalance());
	}

	@Override
	public void withdrawal(double withdrawalAmount) {
		if (customer.getBalance() > withdrawalAmount) {
			customer.setBalance(customer.getBalance() - withdrawalAmount);
			System.out.println("Current Balance of Customer : "+customer.getBalance());
		} else {
			System.out.println("Insufficient Balance to Withdrawal/Transfer");
		}
	}

	@Override
	public void transfer(double transferAmount) {
		this.withdrawal(transferAmount);
	}

	@Override
	public void logout() {
		System.out.println("Thank you for using our Banking System");
		System.exit(0);
	}

}
