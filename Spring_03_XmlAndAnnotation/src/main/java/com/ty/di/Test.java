package com.ty.di;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ConfigurableApplicationContext app = new ClassPathXmlApplicationContext("config.xml");

		Student student = (Student) app.getBean("student");

		student.display();

		System.out.println("========================");

		School sch = (School) app.getBean("school");

		sch.display();

		System.out.println("===========================");

		Bike bike = (Bike) app.getBean("bike");
		
		bike.display();
	}
}
