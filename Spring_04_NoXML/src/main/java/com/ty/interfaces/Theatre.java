package com.ty.interfaces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Theatre {

//	@Autowired
//	@Qualifier(value = "sholay")
	Movie movie;

//	@Autowired
//	@Qualifier(value = "pushpa")
	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	@Autowired
	public Theatre(@Qualifier(value="pushpa")Movie movie) {
		this.movie = movie;
	}

	public void play() {
		System.out.println("Theatre is playing a movie");
		movie.story();
	}
}
