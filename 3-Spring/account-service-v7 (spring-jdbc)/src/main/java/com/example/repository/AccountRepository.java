package com.example.repository;

import com.example.model.Account;
import com.example.model.Txn;

public interface AccountRepository {

	Account load(String accNum);

	Account update(Account account);

	default void save(Txn txn) {
		//
	}

}