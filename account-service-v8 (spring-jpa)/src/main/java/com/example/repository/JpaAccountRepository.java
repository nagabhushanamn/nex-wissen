package com.example.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.example.model.Account;
import com.example.model.Txn;

@Repository
@Qualifier("jpa")
public class JpaAccountRepository implements AccountRepository {

	private static final Logger LOGGER = Logger.getLogger("App");

	@PersistenceContext
	private EntityManager em;

	public JpaAccountRepository() {
		LOGGER.info("JpaAccountRepository created");
	}

	public Account load(String accNum) {
		LOGGER.info("loading account : " + accNum);
		return em.find(Account.class, accNum);
	}

	public Account update(Account account) {
		//
		LOGGER.info("updating account : " + account.getNumber());
		return em.merge(account);
	}

	@Override
	public void save(Txn txn) {
		em.persist(txn);
	}

}
