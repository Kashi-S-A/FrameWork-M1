package com.ty.di;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
//Field injection
public class Student {

	@Value(value = "Martin")
	String name;

	@Value(value = "martin@gmail.com")
	String email;

	@Value(value = "101")
	int sid;

	public void display() {
		System.out.println("Name : " + name);
		System.out.println("Email : " + email);
		System.out.println("Sid : " + sid);
	}
}
