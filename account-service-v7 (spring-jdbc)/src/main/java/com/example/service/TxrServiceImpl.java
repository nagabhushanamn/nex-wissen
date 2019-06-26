package com.example.service;

import org.apache.log4j.Logger;
import org.springframework.transaction.annotation.Transactional;

import com.example.model.Account;
import com.example.repository.AccountRepository;

public class TxrServiceImpl implements TxrService {

	private static final Logger LOGGER = Logger.getLogger("App");

	private AccountRepository accountRepository;

	public TxrServiceImpl() {
		LOGGER.info("TxrServiceImpl created");
	}

	public void setAccountRepository(AccountRepository accountRepository) {
		this.accountRepository = accountRepository;
		LOGGER.info("TxrServiceImpl got injection with accountRepository");
	}

	@Transactional
	@Override
	public boolean transfer(double amount, String fromAccNum, String toAccNum) {
		LOGGER.info("Txr initiated");
		Account fromAccount = accountRepository.load(fromAccNum);
		Account toAccount = accountRepository.load(toAccNum);

		fromAccount.setBalance(fromAccount.getBalance() - amount);
		toAccount.setBalance(toAccount.getBalance() + amount);

		accountRepository.update(fromAccount);
		boolean b = false;
		if (b)
			throw new RuntimeException("ooops");
		accountRepository.update(toAccount);

		LOGGER.info("Txr finished");

		return true;

	}

}
