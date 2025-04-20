package com.ty;

import java.util.Arrays;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Insert {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Student student=new Student();
		student.setStId(101);
		student.setName("A");
		student.setPhone(345678);
		
		Subject sub1=new Subject();
		sub1.setName("Java");
		sub1.setSubId(111);
		
		Subject sub2=new Subject();
		sub2.setName("SQL");
		sub2.setSubId(222);
		
		student.setSubjects(Arrays.asList(sub1,sub2));
		
		et.begin();
		em.persist(student);
		em.persist(sub1);
		em.persist(sub2);
		et.commit();
	}
}
