package com.example;

import org.apache.log4j.Logger;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.config.AccountServiceConfiguration;
import com.example.repository.AccountRepository;
import com.example.service.TxrService;

public class TestApp {

	private static final Logger LOGGER = Logger.getLogger("App");

	public static void main(String[] args) {

		// -------------------------------------
		// init / boot
		// -------------------------------------
		ConfigurableApplicationContext context = null;
		context = new AnnotationConfigApplicationContext(AccountServiceConfiguration.class);

		LOGGER.info("app init/booted..");
		System.out.println();
		// -------------------------------------
		// use
		// -------------------------------------
		LOGGER.info("app in use");
		
		AccountRepository accountRepository=context.getBean(AccountRepository.class);
		accountRepository.findByAmount(298000)
		.forEach(System.out::println);
		

		// -------------------------------------
		// destroy
		// -------------------------------------
		LOGGER.info("app destroyed");
		context.close();
		// -------------------------------------
	}
	
	

}
