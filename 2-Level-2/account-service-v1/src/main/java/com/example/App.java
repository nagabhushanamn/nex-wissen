package com.example;

import org.apache.log4j.Logger;

import com.example.service.NEFTTxrService;

public class App {

	private static final Logger LOGGER = Logger.getLogger("App-Name");

	public static void main(String[] args) {

		// -------------------------------------
		// init / boot
		// -------------------------------------

		NEFTTxrService txrService = new NEFTTxrService();

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
