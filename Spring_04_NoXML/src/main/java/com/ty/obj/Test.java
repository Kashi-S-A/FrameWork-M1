package com.ty.obj;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		ConfigurableApplicationContext app = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Car car = (Car)app.getBean("car");
		
		car.details();
		
		car.racing();
		
		System.out.println("-----------------------------");
		
		Person p = (Person)app.getBean("person");
		
		p.use();
	}
}
