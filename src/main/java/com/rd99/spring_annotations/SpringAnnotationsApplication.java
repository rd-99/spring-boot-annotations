package com.rd99.spring_annotations;

import com.rd99.spring_annotations.ComponentAndAutoWired.PizzaClass;
import com.rd99.spring_annotations.QualifierAnnotation.Pizza;
import com.rd99.spring_annotations.QualifierAnnotation.PizzaInterface;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringAnnotationsApplication {

	public static void main(String[] args) {
		var context = SpringApplication.run(SpringAnnotationsApplication.class, args);
		///ComponentAndAutoWired
		//PizzaClass pizzaClass = context.getBean(PizzaClass.class);
		//System.out.println(pizzaClass.tastePizza());
		///ComponentAndAutoWired

		//Qualifier
		Pizza pizza = context.getBean(Pizza.class);
		System.out.println(pizza.eatAndTastePizza());
		//Qualifier

		//Bean
		PizzaInterface tangy = (PizzaInterface) context.getBean("tangyPizzaBean");
		tangy.tastePizza();
		//Bean








	}

}
