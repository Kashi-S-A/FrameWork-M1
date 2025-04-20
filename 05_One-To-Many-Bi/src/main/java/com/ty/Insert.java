package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Insert {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Author author = new Author();
		author.setAid(101);
		author.setName("Robin Sharma");
		author.setEmail("robin@gmail.com");
		
		Book book1 = new Book();
		book1.setBid(111);
		book1.setName("5Am club");
		book1.setPrice(350);
		book1.setAuthor(author);
		
		Book book2 = new Book();
		book2.setBid(222);
		book2.setName("The Monk Who sold his ferrari");
		book2.setPrice(250);
		book2.setAuthor(author);
		
		et.begin();
		em.persist(author);
		em.persist(book1);
		em.persist(book2);
		et.commit();
	}
}
