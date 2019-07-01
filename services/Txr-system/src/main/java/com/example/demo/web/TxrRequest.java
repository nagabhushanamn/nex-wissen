package com.example.demo.web;

public class TxrRequest {

	private String fromAccNum;
	private String toAccNum;
	private double amount;

	public String getFromAccNum() {
		return fromAccNum;
	}

	public void setFromAccNum(String fromAccNum) {
		this.fromAccNum = fromAccNum;
	}

	public String getToAccNum() {
		return toAccNum;
	}

	public void setToAccNum(String toAccNum) {
		this.toAccNum = toAccNum;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

}
