package com.ty.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {

	@Autowired
	Engine engine ;
	
	public void speed() {
		engine.start();
		System.out.println("Car is going in high speed");
	}
}
