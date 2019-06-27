package com.example;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.example.model.Address;
import com.example.model.Employee;
import com.example.model.Gender;

public class App1 {

	public static void main(String[] args) {

		Employee employee = new Employee();
		employee.setId(1);
		employee.setName("Nag");
		employee.setSalary(1000.00);
		employee.setGender(Gender.MALE);
		employee.setDob(LocalDate.now());
		employee.setJoinDate(LocalDateTime.now());

		Address address = new Address();
		address.setStreet("home-street");
		address.setCity("chennai");
		address.setCountry("idia");

//		employee.setAddress(address);

		Address officeAddress = new Address();
		officeAddress.setStreet("office-street");
		officeAddress.setCity("bengalore");
		officeAddress.setCountry("india");

//		employee.setOfficeAddress(officeAddress);

		employee.getAddresses().add(address);
		employee.getAddresses().add(officeAddress);

		// -------------------------------------------
		// using JPA
		// -------------------------------------------

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("myPU");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();

		em.persist(employee);

		em.getTransaction().commit();
		em.close();
		emf.close();

	}

}
