package com.ty;

import java.util.Arrays;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class InsertExisting {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Student student=new Student();
		student.setStId(102);
		student.setName("B");
		student.setPhone(876567);
		
		Subject sub1=em.find(Subject.class, 111);
		
		Subject sub2=em.find(Subject.class, 222);
		
		Subject sub3=new Subject();
		sub3.setName("Web Tech");
		sub3.setSubId(333);
		
		student.setSubjects(Arrays.asList(sub1,sub2,sub3));
		
		et.begin();
		em.persist(student);
		em.persist(sub3);
		et.commit();
	}
}
