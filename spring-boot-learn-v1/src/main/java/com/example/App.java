package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.config.AccountServiceConfiguration;
import com.example.service.TxrService;

public class App {

	public static void main(String[] args) {

		// -------------------------------------
		// init / boot
		// -------------------------------------

		ConfigurableApplicationContext context = null;
		context = SpringApplication.run(AccountServiceConfiguration.class, args);

		// -------------------------------------
		// use
		// -------------------------------------

		TxrService txrService = context.getBean(TxrService.class);
		txrService.transfer(100.00, "1", "2");

		String sub1 = context.getBean("sub1", String.class);
		System.out.println(sub1);

		// -------------------------------------
		// destroy
		// -------------------------------------
		context.close();
		// -------------------------------------
	}

}
