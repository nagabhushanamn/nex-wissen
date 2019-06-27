package com.example;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.example.model.Boy;
import com.example.model.Girl;

public class App5 {

	public static void main(String[] args) {


		// -------------------------------------------
		// using JPA
		// -------------------------------------------

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("myPU");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();

		Girl girl=em.find(Girl.class, 22);
		System.out.println(girl.getName());
		System.out.println(girl.getBoy().getName());

		em.getTransaction().commit();
		em.close();
		emf.close();

	}

}
