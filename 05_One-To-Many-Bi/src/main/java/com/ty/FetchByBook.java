package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FetchByBook {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		
		Book book = em.find(Book.class, 111);
		
		if (book!=null) {
			System.out.println(book);
			Author author = book.getAuthor();
			System.out.println(author);
		} else {
			System.out.println("Not found");
		}
	}
}
