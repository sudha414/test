package com.practice.exception;

public class CheckingAccount {
	
	private double balance;
	private int number;
	public CheckingAccount(int number) {
		this.number = number;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
	public void deposit(double amount){
		balance = balance + amount ;
		System.out.println("Your balance amount is ::"+balance);
	}
	
	public void withdraw(double amount) throws InsufficientBalanceException{
		if(amount <= balance){
			balance -= amount;
			System.out.println("Your balance amount is ::"+balance);
		}
		else{
			double amountNeeded = amount - balance;
			throw new InsufficientBalanceException(amountNeeded);
			
		}
			
	}

}
