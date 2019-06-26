package com.example.model;

public class Account {

	private String number;
	private String balance;

	public Account(String number) {
		super();
		this.number = number;
	}

	@Override
	public String toString() {
		return "Account [number=" + number + ", balance=" + balance + "]";
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getBalance() {
		return balance;
	}

	public void setBalance(String balance) {
		this.balance = balance;
	}

}
