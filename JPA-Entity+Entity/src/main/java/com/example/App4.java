package com.example;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.example.model.Boy;
import com.example.model.Girl;

public class App4 {

	public static void main(String[] args) {

		// -------------------------------------------
		// using JPA
		// -------------------------------------------

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("myPU");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();

		Boy boy = em.find(Boy.class, 11);
		System.out.println(boy.getName());

		System.out.println("---------------------------");
		System.out.println(boy.getGirl().getName());
		System.out.println("---------------------------");

		em.getTransaction().commit();
		em.close();
		emf.close();

	}

}
