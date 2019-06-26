package com.example.repository;

import org.apache.log4j.Logger;

import com.example.model.Account;

public class JpaAccountRepository {

	private static final Logger LOGGER = Logger.getLogger("App");

	public JpaAccountRepository() {
		LOGGER.info("JpaAccountRepository created");
	}

	public Account load(String accNum) {
		LOGGER.info("loading account : " + accNum);
		// ...
		return new Account("000000");
	}

	public Account update(Account account) {
		//
		LOGGER.info("updating account : " + account.getNumber());
		return null;
	}

}
