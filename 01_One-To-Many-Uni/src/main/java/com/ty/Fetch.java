package com.ty;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Fetch {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		
		Author author = em.find(Author.class, 101);
		
		if (author!=null) {
			System.out.println(author);
			List<Book> books = author.getBooks();
			for (Book book : books) {
				System.out.println(book);
				System.out.println("================");
			}
		} else {
			System.out.println("Not found");
		}
	}
}
