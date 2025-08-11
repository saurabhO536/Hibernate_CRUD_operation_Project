package com.jsp.driver;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.jsp.entity.Student;

public class Fetch {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("om");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		
		Student student=entityManager.find(Student.class, 101);
		
		System.out.println(student);
	}

}
