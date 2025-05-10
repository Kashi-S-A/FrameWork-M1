package com.ty.interfaces;

import org.springframework.stereotype.Component;

@Component
public class Sholay implements Movie{

	public void story() {
		System.out.println("About Gabbar villain");
	}

}
