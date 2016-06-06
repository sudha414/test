package com.practice.exception;

public class CustomExceptionDemoBank {

	public static void main(String[] args) {
		CheckingAccount sudha = new CheckingAccount(101);
		sudha.deposit(500);
		
		try {
			System.out.println("withdrawing amount of $100");
			sudha.withdraw(100);
			System.out.println("withdrawing amount of $600");
			sudha.withdraw(600);
		} catch (InsufficientBalanceException e) {
			// TODO Auto-generated catch block
			System.out.println("Sorry you are deficient of this amount::"+e.getAmount());
			e.printStackTrace();
		}

	}

}
