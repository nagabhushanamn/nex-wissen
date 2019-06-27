package com.example;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.example.model.Address;
import com.example.model.Boy;
import com.example.model.Employee;
import com.example.model.Gender;
import com.example.model.Girl;

public class App2 {

	public static void main(String[] args) {

		Boy boy = new Boy();
		boy.setId(11);
		boy.setName("Nag");

		Girl girl = new Girl();
		girl.setId(22);
		girl.setName("Indu");
		
		boy.setGirl(girl);

		// -------------------------------------------
		// using JPA
		// -------------------------------------------

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("myPU");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();

//		em.persist(girl);
		em.persist(boy);
		

		em.getTransaction().commit();
		em.close();
		emf.close();

	}

}
