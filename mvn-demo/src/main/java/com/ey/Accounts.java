package com.ey;

public class Accounts {

	private double balance;
	
	public Accounts(double balance) {
		this.balance = balance;
	}
	public double deposit(double amount) {
		if(amount<0) {
			throw new NumberFormatException("Negative amounnt");
		}
		balance +=amount;
		return balance;
	}
	public double withdraw(double amount) throws BalanceExcepction{
		if(amount<0) {
			throw new NumberFormatException("Negative Number");
		}
		if(amount > balance) {
			throw new BalanceExcepction("Insufficeint funds!");
		}
		balance -= amount;
		return balance;
	}
}