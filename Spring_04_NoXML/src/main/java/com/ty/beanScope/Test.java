
package com.ty.beanScope;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
ConfigurableApplicationContext app 
= new AnnotationConfigApplicationContext(AppConfig.class);

		Car c1 = (Car) app.getBean("car");
		System.out.println(c1);
		
		Car c2 = (Car) app.getBean("car");
		System.out.println(c2);
		
		Car c3 = (Car) app.getBean("car");
		System.out.println(c3);
	}
}
