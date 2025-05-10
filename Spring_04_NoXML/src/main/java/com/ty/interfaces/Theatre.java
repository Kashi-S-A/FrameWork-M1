package com.ty.interfaces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Theatre {

	@Autowired
	Movie movie;
	
	public void play() {
		System.out.println("Theatre is playing a movie");
		movie.story();
	}
}
