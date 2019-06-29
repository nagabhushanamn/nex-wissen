package com.example.exception;

public class TxrFailedException extends RuntimeException {

	public TxrFailedException(String message) {
		super(message);
	}

}
