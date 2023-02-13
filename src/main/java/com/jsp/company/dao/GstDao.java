package com.jsp.company.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.company.dto.Gst;



public class GstDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Nikita");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public Gst createGst(Gst gst) {
		entityTransaction.begin();
		entityManager.persist(gst);
		entityTransaction.commit();

		System.out.println("Gst Details Saved..");
		return gst;

	}

	public Gst getGstByID(int id) {
		Gst g1 = entityManager.find(Gst.class, id);
		return g1;
	}

	public Gst deleteGstByID(int id) {
		Gst g1 = entityManager.find(Gst.class, id);

		entityTransaction.begin();
		entityManager.remove(g1);
		entityTransaction.commit();

		System.out.println("Review Details Deleted..");
		return g1;
	}

	public Gst updateGst(int id, long gstno) {
		Gst g1 = entityManager.find(Gst.class, id);

		if (g1 != null) {
			g1.setGstno(gstno);
			entityTransaction.begin();
			entityManager.merge(g1);
			entityTransaction.commit();

		} else {
			System.out.println("Gst Details found..");

		}
		return g1;
	}

}
