package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.config.AccountServiceConfiguration;
import com.example.service.TxrService;

public class App {

	public static void main(String[] args) {

		// -------------------------------------
		// init / boot
		// -------------------------------------
//		ConfigurableApplicationContext context = null;
//		context = new AnnotationConfigApplicationContext(AccountServiceConfiguration.class);

		ConfigurableApplicationContext context = null;
		context = SpringApplication.run(AccountServiceConfiguration.class, args);

		// -------------------------------------
		// use
		// -------------------------------------

		TxrService txrService = context.getBean(TxrService.class);
		txrService.transfer(100.00, "1", "2");

		// -------------------------------------
		// destroy
		// -------------------------------------
		context.close();
		// -------------------------------------
	}

}
