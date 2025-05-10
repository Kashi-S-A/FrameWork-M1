package com.ty.obj;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {

//	@Autowired //field / variable injection
	Mobile mobile;

//	@Autowired //setter injection
	public void setMobile(Mobile mobile) {
		this.mobile = mobile;
	}

	@Autowired  //constructor injection
	public Person(Mobile mobile) {
		this.mobile = mobile;
	}

	public void use() {
		System.out.println("Person is using mobile");
		mobile.ringin();
	}
}
