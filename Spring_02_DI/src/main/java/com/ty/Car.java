package com.ty;

public class Car {

	String brand;

	double price;

	public Car(String brand, double price) {
		this.brand = brand;
		this.price = price;
	}

	public void display() {
		System.out.println("Brand : " + brand);
		System.out.println("Price : " + price);
	}
}
