package com.example;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaBuilder.In;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import com.example.model.Employee;

public class CriteriaAPI {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("myPU");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();

		CriteriaBuilder cb = em.getCriteriaBuilder();

		CriteriaQuery<Employee> cq = cb.createQuery(Employee.class);

		Root<Employee> root = cq.from(Employee.class);

		In<Double> inClause = cb.in(root.get("salary"));

		double[] salaries = { 1000, 2000 };
		for (double salary : salaries) {
			inClause.value(salary);
		}

		cq = cq.select(root).where(inClause);
		Query query = em.createQuery(cq);

		List<Employee> employees = query.getResultList();
		employees.forEach(System.out::println);

		em.getTransaction().commit();
		em.close();
		emf.close();

	}

}
