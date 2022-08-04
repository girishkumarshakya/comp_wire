package com.compwire;

import com.compwire.entity.Cat;
import com.compwire.entity.Dog;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class CompWireApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(CompWireApplication.class, args);
		Dog dog = context.getBean(Dog.class);
		System.out.println("=============DOG====================");
		System.out.println(dog);
		System.out.println("=============CAT====================");
		Cat cat = context.getBean(Cat.class);
		System.out.println(cat);
		System.out.println("===================================");
	}

}
