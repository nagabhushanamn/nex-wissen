package com.example;

import org.apache.log4j.Logger;

import com.example.repository.AccountRepository;
import com.example.repository.JdbcAccountRepository;
import com.example.repository.JpaAccountRepository;
import com.example.service.NEFTTxrService;
import com.example.service.TxrService;

public class App {

	private static final Logger LOGGER = Logger.getLogger("App");

	public static void main(String[] args) {

		// -------------------------------------
		// init / boot
		// -------------------------------------

		AccountRepository jdbcAccountRepository = new JdbcAccountRepository();
		AccountRepository jpaAccountRepository = new JpaAccountRepository();
		TxrService txrService = new NEFTTxrService(jpaAccountRepository);

		LOGGER.info("app init/booted..");
		System.out.println();
		// -------------------------------------
		// use
		// -------------------------------------
		LOGGER.info("app in use");
		txrService.transfer(100.00, "1", "2");
		System.out.println();
		txrService.transfer(100.00, "2", "1");

		System.out.println();
		// -------------------------------------
		// destroy
		// -------------------------------------
		LOGGER.info("app destroyed");
		//
		// -------------------------------------
	}

}
