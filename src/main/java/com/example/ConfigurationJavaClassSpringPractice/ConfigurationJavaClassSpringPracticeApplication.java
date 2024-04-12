package com.example.ConfigurationJavaClassSpringPractice;

import com.example.ConfigurationJavaClassSpringPractice.models.Animal;
import com.example.ConfigurationJavaClassSpringPractice.models.Owner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class ConfigurationJavaClassSpringPracticeApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigurationJavaClassSpringPracticeApplication.class, args);

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		Animal a = context.getBean(Animal.class);

		System.out.println(a);
		a.setType("Ladybug");
		a.setName("Luna");
		a.setWeight(1);
		a.setColor("Red");
		a.getOwner().setName("Han");
		a.getOwner().setAge(24);

		System.out.println(a);

		Animal a2 = context.getBean(Animal.class);
		System.out.println(a2);
		a2.setName("Cornelius");
		a2.setWeight(5);
		System.out.println(a);
		System.out.println(a2);

		// if ApplicationContext is not closed, it may cause Resource Leak
		context.close();
	}

}
