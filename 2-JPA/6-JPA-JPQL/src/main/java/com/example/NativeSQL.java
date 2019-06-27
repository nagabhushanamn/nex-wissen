package com.example;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.example.model.Employee;

public class NativeSQL {

	public static void main(String[] args) {

		// -------------------------------------------
		// using JPA
		// -------------------------------------------

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("myPU");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();

		em.createNamedQuery("getAll")
		.getResultList()
		.forEach(System.out::println);
				

		em.getTransaction().commit();
		em.close();
		emf.close();

	}

}
