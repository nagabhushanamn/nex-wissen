package com.example.service;

import java.time.LocalDateTime;

import org.apache.log4j.Logger;
import org.springframework.transaction.annotation.Transactional;

import com.example.model.Account;
import com.example.model.Txn;
import com.example.model.TxnType;
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
		
		Txn debitTxn=new Txn();
		debitTxn.setAccount(fromAccount);
		debitTxn.setAmount(amount);
		debitTxn.setClosingBalance(fromAccount.getBalance());
		debitTxn.setType(TxnType.DEBIT);
		debitTxn.setLocalDateTime(LocalDateTime.now());
		
		
		Txn creditTxn=new Txn();
		creditTxn.setAccount(toAccount);
		creditTxn.setAmount(amount);
		creditTxn.setClosingBalance(toAccount.getBalance());
		creditTxn.setType(TxnType.CREDIT);
		creditTxn.setLocalDateTime(LocalDateTime.now());
		
		accountRepository.save(debitTxn);
		accountRepository.save(creditTxn);

		LOGGER.info("Txr finished");

		return true;

	}

}
