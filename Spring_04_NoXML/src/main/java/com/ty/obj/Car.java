package com.ty.obj;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Car {

	@Value(value = "TATA")
	String brand;

	@Value(value = "1200000")
	double price;

	@Autowired
	Engine engine;
	
	public void racing() {
		engine.exhaust();
		System.out.println("car is speeding");
	}

	public void details() {
		System.out.println("=========Car===========");
		System.out.println("Brand : "+brand);
		System.out.println("price : "+price);
		System.out.println("=========Engine==========");
		System.out.println(engine.cc);
	}
}
