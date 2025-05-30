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
		
		Product product=new Product();
		product.setPid(111);
		product.setName("Laptop");
		product.setPrice(50000);
		
		Review r1=new Review();
		r1.setRid(101);
		r1.setMsg("Good");
		r1.setProduct(product);
		
		Review r2=new Review();
		r2.setRid(102);
		r2.setMsg("Bad");
		r2.setProduct(product);
		
		et.begin();
		em.persist(product);
		em.persist(r1);
		em.persist(r2);
		et.commit();
	}
}
