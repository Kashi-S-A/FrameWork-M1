package com.ty.bean;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {

	@Value(value = "Allen")
	String name;

	@Value(value = "101")
	int sid;

	@Autowired
	List<String> subjects;

	public void display() {
		System.out.println("Name : " + name);
		System.out.println("Sid : " + sid);
		System.out.println("-----------Subjects----------");

		for (String subject : subjects) {
			System.out.println(subject);
		}
	}
}
