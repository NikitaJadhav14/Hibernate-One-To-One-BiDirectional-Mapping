package com.jsp.company.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.company.dto.Company;

public class CompanyDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Nikita");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public Company createCompany(Company company) {
		entityTransaction.begin();
		entityManager.persist(company);
		entityTransaction.commit();

		System.out.println("Company Details Saved..");
		return company;

	}

	public Company getCompanyByID(int id) {
		Company c1 = entityManager.find(Company.class, id);
		System.out.println("Company Details..");
		System.out.println(c1.getId());
		System.out.println(c1.getName());
		System.out.println(c1.getLoc());
		return c1;
	}

	public Company deletCompany(int id) {
		Company c1 = entityManager.find(Company.class, id);

		entityTransaction.begin();
		entityManager.remove(c1);
		entityTransaction.commit();

		System.out.println("Company Details Deleted..");
		return c1;
	}

	public Company updateCompany(int id, String loc, String name) {
		Company c1 = entityManager.find(Company.class, id);

		if (c1 != null) {
			c1.setLoc(loc);
			c1.setName(name);
			entityTransaction.begin();
			entityManager.merge(c1);
			entityTransaction.commit();

		} else {
			System.out.println("Company Details Not found..");

		}
		return c1;
	}
}
