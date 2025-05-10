package com.ty.di;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
//constructor injection
public class Bike {

	String brand;

	double price;

	
	public Bike(@Value(value = "RE") String brand, @Value(value = "350000") double price) {
		this.brand = brand;
		this.price = price;
	}

	public void display() {
		System.out.println("Brand : "+brand);
		System.out.println("Price : "+price);
	}
}
