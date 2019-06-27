package com.example;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.example.model.Boy;
import com.example.model.Girl;

public class App3 {

	public static void main(String[] args) {

		Girl girl = new Girl();
		girl.setId(22);
		girl.setName("Indu");

		// -------------------------------------------
		// using JPA
		// -------------------------------------------

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("myPU");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();

		em.persist(girl);

		em.getTransaction().commit();
		em.close();
		emf.close();

	}

}
