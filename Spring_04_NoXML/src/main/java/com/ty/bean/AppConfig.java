package com.ty.bean;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.ty.bean")
public class AppConfig {

	@Bean
	public List<String> getList() {
		return Arrays.asList("HTML","SQL","JAVA");
	}
	
	@Bean
	public Engine getEngine() {
		return new Engine();
	}
}
