package com.springexample.learnspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWolrdSpring {
	public static void main(String[] args) {
		//1: Launch a spring application
		var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
		
		//2: Configure the things that we want spring to manage - @Configuration
		//HelloWorldConfiguration -@Configuration
		//name -@Bean
		
		//3: Retrieving Beans managed by spring 
		System.out.println(context.getBean("name"));
		System.out.println(context.getBean("age"));
		System.out.println(context.getBean("person"));
		System.out.println(context.getBean("address"));
		System.out.println(context.getBean(Address.class));
		System.out.println(context.getBean("person2CallingBeanMethod"));
		System.out.println(context.getBean("person3Parameters"));
	}
}
