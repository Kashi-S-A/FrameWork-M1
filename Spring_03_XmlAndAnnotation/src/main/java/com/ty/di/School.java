package com.ty.di;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
//setter injection
public class School {

	private String name;
	
	private String address;
	
	@Value(value = "Thane")
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Value(value = "Govt School")
	public void setName(String name) {
		this.name = name;
	}
	
	public void display() {
		System.out.println("Name : "+name);
		System.out.println("Address : "+address);
	}
}
