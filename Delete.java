package com.jsp.driver;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.entity.Student;

public class Delete {

	public static void main(String[] args) {
		EntityManager entityManager=Persistence.createEntityManagerFactory("om").createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Student student=entityManager.find(Student.class,104);
		
		entityTransaction.begin();
		entityManager.remove(student);
		entityTransaction.commit();

	}

}
