package com.ty.di;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ty.AppConfig;

public class Test {

	public static void main(String[] args) {
		ConfigurableApplicationContext app = new AnnotationConfigApplicationContext(AppConfig.class);

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
