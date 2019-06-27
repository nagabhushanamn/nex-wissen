package com.example;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.example.model.Employee;

public class JPQL {

	public static void main(String[] args) {

		// -------------------------------------------
		// using JPA
		// -------------------------------------------

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("myPU");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();

		// --------------------------------------------------------
//		
//		String jpql = "from Employee e";
//		Query query = em.createQuery(jpql);
//		List<Employee> employees = query.getResultList();
//		employees.forEach(System.out::println);

		// --------------------------------------------------------

//		String jpql = "from Employee e";
//		Query query = em.createQuery(jpql);
//		query.setFirstResult(5);
//		query.setMaxResults(5);
//		List<Employee> employees = query.getResultList();
//		employees.forEach(System.out::println);

		// --------------------------------------------------------

		// String jpql = "from Employee e where e.name='EMP-1'";

		//
		// String jpql = "from Employee e where e.name=" + nameParam+"";

		// A- positional parameters
//		String jpql = "from Employee e where e.name=?1";
//		Query query = em.createQuery(jpql);
//		String nameParam = "EMP-1";
//		query.setParameter(1, nameParam);
//		List<Employee> employees = query.getResultList();
//		employees.forEach(System.out::println);

		// B- named parameters
//		String jpql = "from Employee e where e.name=:empName";
//		Query query = em.createQuery(jpql);
//		String nameParam = "EMP-1";
//		query.setParameter("empName", nameParam);
//		List<Employee> employees = query.getResultList();
//		employees.forEach(System.out::println);

		// --------------------------------------------------------

//		String jpql = "from Employee e where e.department.name=:depName";
//		Query query = em.createQuery(jpql);
//		query.setParameter("depName", "IT");
//		List<Employee> employees = query.getResultList();
//		employees.forEach(System.out::println);

		// --------------------------------------------------------

//		String jpql = "select e.name,e.salary from Employee e";
//		Query query = em.createQuery(jpql);
//		List<Object[]> employees = query.getResultList();
//		employees.forEach(oa->System.out.println(oa[0]+"\t"+oa[1]));

		// --------------------------------------------------------

//		String jpql = "select new list(e.name,e.salary) from Employee e";
//		String jpql = "select new map(e.name,e.salary) from Employee e";
//		String jpql = "select new com.example.model.EmpSummary(e.id,e.name) from Employee e";
//		Query query = em.createQuery(jpql);
//		List<EmpSummary> employees = query.getResultList();
//		employees.forEach(e->System.out.println(e));

		// --------------------------------------------------------

//		Query query = em.createNamedQuery("findAll");
//		List<Employee> employees = query.getResultList();
//		employees.forEach(System.out::println);


		em.getTransaction().commit();
		em.close();
		emf.close();

	}

}
