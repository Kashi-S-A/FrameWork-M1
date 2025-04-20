package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Fetch {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		
		Review review = em.find(Review.class, 102);
		
		if (review!=null) {
			System.out.println(review);
			Product product = review.getProduct();
			System.out.println(product);
		} else {
			System.out.println("not found");
		}
	}
}
