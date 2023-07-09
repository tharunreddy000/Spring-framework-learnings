package com.springexample.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person (String name, int age, Address address) {};
record Address (String firstLine, String city) {};
@Configuration
public class HelloWorldConfiguration {
	
	@Bean
	public String name() {
		return "tharun";
	}
	
	@Bean
	public int age() {
		return 20;
	}
	
	@Bean
	public Person person() {
		return new Person("varun", 19, new Address("1st Road", "Koramangala"));
	}
	
	@Bean
	public Person person2CallingBeanMethod() {
		return new Person(name(),age(), address());  //name ,age
	}
	
	@Bean
	public Person person3Parameters(String name, int age,Address address3) {//name, age, address2
		return new Person(name(), age(), address3);
	}
	
	@Bean
	public Address address() {
		return new Address("MainRoad", "Bangalore");
	}
	
	@Bean(name = "address3")
	@Primary
	public Address address3() {
		return new Address("Tarvereka","Bangalore");
	}
	
}
