package com.jsp.person.pan.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.person.pan.dto.Pan;

public class PanDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("sahil");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public Pan createPan(Pan pan) {
		entityTransaction.begin();
		entityManager.persist(pan);
		entityTransaction.commit();

		System.out.println("Pan Details Saved...");
		return pan;
	}

	public Pan getPanById(int id) {
		Pan p1 = entityManager.find(Pan.class, id);

		return p1;
	}

	public Pan deletePanById(int id) {
		Pan p1 = entityManager.find(Pan.class, id);

		entityTransaction.begin();
		entityManager.remove(p1);
		entityTransaction.commit();

		System.out.println("Pan Details deleted....");
		return p1;
	}

	public Pan updatePanById(int id, String name, long pan_no) {

		Pan p1 = entityManager.find(Pan.class, id);

		if (p1 != null) {
			p1.setName(name);
			p1.setPan_no(pan_no);
			entityTransaction.begin();
			entityManager.merge(p1);
			entityTransaction.commit();
		} else {
			System.out.println("pan details not found...");
		}
		return p1;
	}
}
