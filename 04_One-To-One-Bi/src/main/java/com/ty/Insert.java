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
		
		Car car = new Car();
		car.setCid(101);
		car.setName("TATA");
		car.setPrice(1300000);
		
		Engine engine=new Engine();
		engine.setEid(111);
		engine.setCc(1000);
		
		car.setEngine(engine);
		
		et.begin();
		em.persist(engine);
		em.persist(car);
		et.commit();
		
	}
}
