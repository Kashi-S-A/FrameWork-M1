package com.ty;

public class Person {

	private String name;

	private long phone;

	public void setName(String name) {
		this.name = name;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}
	
	public void display() {
		System.out.println("Name : " + name);
		System.out.println("Phone : " + phone);
	}
}
