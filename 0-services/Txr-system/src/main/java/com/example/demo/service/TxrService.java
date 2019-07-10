package com.example.demo.service;

public interface TxrService {

	boolean transfer(double amount, String fromAccNum, String toAccNum);

}