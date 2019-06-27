package com.example;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.example.model.Employee;
import com.example.model.Gender;

public class Create {

	public static void main(String[] args) {

		Employee employee = new Employee(); // New
		employee.setId(3);
		employee.setName("Indu");
		employee.setSalary(3000.00);
		employee.setGender(Gender.FEMALE);
		employee.setDob(LocalDate.now());
		employee.setJoinDate(LocalDateTime.now());

		// -------------------------------------------
		// using JPA
		// -------------------------------------------

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("myPU");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();

		em.persist(employee); // Managed
		employee.setSalary(3000.0);

		em.getTransaction().commit();
		em.close();
		emf.close();

	}

}
