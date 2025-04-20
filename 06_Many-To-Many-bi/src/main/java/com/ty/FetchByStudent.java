package com.ty;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FetchByStudent {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		
		Student student = em.find(Student.class, 102);
		
		if (student!=null) {
			System.out.println(student);
			List<Subject> subjects = student.getSubjects();
			for (Subject subject : subjects) {
				System.out.println(subject);
				System.out.println("=============");
			}
		} else {
			System.out.println("not found");
		}
	}
}
