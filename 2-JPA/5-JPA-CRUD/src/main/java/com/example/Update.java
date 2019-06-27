package com.example;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.example.model.Employee;
import com.example.model.Gender;

public class Update {

	public static void main(String[] args) {

		// -------------------------------------------
		// using JPA
		// -------------------------------------------

		// ---------------------------------------------
		// Req-1
		// ---------------------------------------------
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("myPU");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		Employee employee = em.find(Employee.class, 1);
		em.getTransaction().commit();
		em.close();

		System.out.println();

		// ---------------------------------------------
		employee.setName("Nagabhushanam"); // Detached
		// ---------------------------------------------

		System.out.println();

		// ---------------------------------------------
		// Req-2
		// ---------------------------------------------

		em = emf.createEntityManager();
		em.getTransaction().begin();
		em.merge(employee); // Managed
		em.getTransaction().commit();
		em.close();

		emf.close();

	}

}
