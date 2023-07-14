package com.in28minutes.learnspringframework.helloworld;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {

	public static void main(String[] args) {
		//Launch a Spring COntext
		try(var context=
				new AnnotationConfigApplicationContext
				(HelloWorldConfiguration.class)){
			
			//COnfigure the things that we want Spring to manage  
			System.out.println(context.getBean("name"));

			System.out.println(context.getBean("age"));
					
			System.out.println(context.getBean("address2"));
			
			System.out.println(context.getBean(Address.class));
			
			System.out.println(context.getBean(Person.class));


			System.out.println(context.getBean("person"));

			System.out.println(context.getBean("person2MethodCall"));
			
			System.out.println(context.getBean("person3Parameters"));
			
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

			System.out.println(context.getBean("person5Qualifier"));

		}
		

		
		
	}

}
