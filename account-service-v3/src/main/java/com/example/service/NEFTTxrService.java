package com.example.service;

import org.apache.log4j.Logger;

import com.example.model.Account;
import com.example.repository.AccountRepository;

public class NEFTTxrService implements TxrService {

	private static final Logger LOGGER = Logger.getLogger("App");

	private AccountRepository accountRepository;

	public NEFTTxrService(AccountRepository accountRepository) {
		this.accountRepository = accountRepository;
		LOGGER.info("NEFTTxrService created with accountRepository");
	}

	@Override
	public boolean transfer(double amount, String fromAccNum, String toAccNum) {
		LOGGER.info("Txr initiated");

		Account fromAccount = accountRepository.load(fromAccNum);
		Account toAccount = accountRepository.load(toAccNum);

		// debit & credit
		fromAccount.setBalance(fromAccount.getBalance()-amount);
		toAccount.setBalance(toAccount.getBalance()+amount);
		
		accountRepository.update(fromAccount);
		accountRepository.update(toAccount);

		LOGGER.info("Txr finished");
		return true;

	}

}
