package com.ty;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestA {

	public static void main(String[] args) {
		ApplicationContext app = new ClassPathXmlApplicationContext("config.xml");

		Employee emp = (Employee) app.getBean("myEmp");

		emp.project();

		Student student = (Student) app.getBean("student");
		
		student.study();
	}
}
