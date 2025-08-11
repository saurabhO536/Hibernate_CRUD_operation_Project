package com.jsp.driver;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.entity.Student;

public class Update {

	public static void main(String[] args) {
		EntityManager entityManager=Persistence.createEntityManagerFactory("om").createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Student student =new Student(104,"Rohan",22);
		
		entityTransaction.begin();
		entityManager.merge(student);
		entityTransaction.commit();

	}

}
