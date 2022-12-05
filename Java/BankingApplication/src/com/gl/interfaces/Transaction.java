package com.gl.interfaces;

public interface Transaction {
	 void deposit(double amount);
	 void withdrawal(double amount);
	 void transfer(double transferAmount);
	 void logout();
}
