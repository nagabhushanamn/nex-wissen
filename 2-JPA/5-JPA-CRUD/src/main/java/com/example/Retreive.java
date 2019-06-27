package com.example;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.example.model.Employee;
import com.example.model.Gender;

/*
 * 
 *  by primary-key 
 *  by JPQL
 *  by Criteria API
 *  by Native SQL
 * 
 */

public class Retreive {

	public static void main(String[] args) {

		// -------------------------------------------
		// using JPA
		// -------------------------------------------

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("myPU");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();

		Employee employee = em.find(Employee.class, 1); // Managed
		System.out.println(employee);
		//employee.setSalary(100.00);

		em.getTransaction().commit();
		em.close();
		emf.close();

	}

}
