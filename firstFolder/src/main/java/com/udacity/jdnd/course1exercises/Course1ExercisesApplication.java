package com.udacity.jdnd.course1exercises;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
public class Course1ExercisesApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(Course1ExercisesApplication.class, args);
        Alien a=context.getBean(Alien.class);
		//@Component is must, define in Alien class so that its object by default created in the SpringBoot container
		//Alien class will follow singleton design pattern
		a.setaId(123);
		a.setaName("abc");
		System.out.println(a);


		//setting scope as a prototype will allow us to create different object for Spaceship class
		//Also there will not be any default object in springBoot container so that we can get the object
		//without calling getBean() function
		Spaceship s1=context.getBean(Spaceship.class);
		s1.setSpaceShipNo(1);
		s1.setSpaceShipPilotName("XYZ");
		System.out.println(s1);
		Spaceship s2=context.getBean(Spaceship.class);
		System.out.println(s2);
	}
}
