package com.ty.obj;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Engine {

	@Value(value = "1000")
	int cc;
	
	public void exhaust() {
		System.out.println("Engine started");
	}
}
