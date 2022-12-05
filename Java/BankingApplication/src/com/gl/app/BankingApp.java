package com.gl.app;

import java.util.Scanner;

import com.gl.entity.Customer;
import com.gl.interfaces.Transaction;
import com.gl.service.TransactionsImpl;
import com.gl.util.OtpGenerator;

public class BankingApp {

	public BankingApp() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String args[]) {
		Customer customer = new Customer(1234567, "glbank", 2000);
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter account number : ");
		long accountNumber = scanner.nextLong();
		System.out.println("Enter password : ");
		String password = scanner.next();
		if (accountNumber == customer.getAccountNumber() && password.equals(customer.getPassword())) {
			Transaction transaction = new TransactionsImpl(customer);
			int option = 0;
			do {
				System.out.println("1. Deposit");
				System.out.println("2. Withdrawal");
				System.out.println("3. Transfer");
				System.out.println("4. Logout");
				System.out.println("Enter Your Option : ");
				option = scanner.nextInt();
				switch (option) {
				case 1:
					System.out.println("Enter the amount to deposit.");
					double depositAmount = scanner.nextDouble();
					transaction.deposit(depositAmount);
					break;
				case 2:
					System.out.println("Enter the amount to withdrawal.");
					double withdrawalAmount = scanner.nextDouble();
					transaction.withdrawal(withdrawalAmount);
					break;
				case 3:
					System.out.println("Enter the account number to transfer.");
					long transferingAccountNumber = scanner.nextLong();
					System.out.println("Enter the amount to transfer.");
					double transferAmount = scanner.nextDouble();
					int otp = (new OtpGenerator()).getOtp();
					System.out.println("System Generated OTP := "+otp);
					System.out.println("Enter the OTP.");
					int userOtp = scanner.nextInt();
					if (userOtp == otp) {
						transaction.transfer(transferAmount);
					} else {
						System.out.println("Invalid OTP has been provided.");
					}
					break;
				case 4:
					scanner.close();
					transaction.logout();
					break;
				default:
					System.out.println("Invalid option choosen by you.");
					break;
				}
			} while (option != 4);
		} else {
			System.out.println("Invalid User or Password.");
		}
	}

}
