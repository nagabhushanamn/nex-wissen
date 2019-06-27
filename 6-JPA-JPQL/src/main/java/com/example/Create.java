package com.example;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.example.model.Department;
import com.example.model.Employee;
import com.example.model.Gender;

public class Create {

	public static void main(String[] args) {

		// -------------------------------------------
		// using JPA
		// -------------------------------------------

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("myPU");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();

		Department department1 = new Department();
		department1.setId(1);
		department1.setName("IT");

		Department department2 = new Department();
		department2.setId(2);
		department2.setName("HR");

		em.persist(department1);
		em.persist(department2);

		for (int i = 0; i < 5; i++) {
			Employee employee = new Employee(); // New
			employee.setDepartment(department1);
			employee.setName("EMP-" + i);
			employee.setSalary(i * 1000);
			employee.setGender(Gender.FEMALE);
			employee.setDob(LocalDate.now());
			employee.setJoinDate(LocalDateTime.now());
			em.persist(employee);
		}
		for (int i = 5; i < 10; i++) {
			Employee employee = new Employee(); // New
			employee.setDepartment(department2);
			employee.setName("EMP-" + i);
			employee.setSalary(i * 1000);
			employee.setGender(Gender.MALE);
			employee.setDob(LocalDate.now());
			employee.setJoinDate(LocalDateTime.now());
			em.persist(employee);
		}

		em.getTransaction().commit();
		em.close();
		emf.close();

	}

}
