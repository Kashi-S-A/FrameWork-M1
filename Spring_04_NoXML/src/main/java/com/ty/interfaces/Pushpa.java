package com.ty.interfaces;

import org.springframework.stereotype.Component;

@Component
//@Primary
public class Pushpa implements Movie {

	public void story() {
		System.out.println("Pushpa steals sandalWood");
	}

}
