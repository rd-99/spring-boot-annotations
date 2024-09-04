package com.rd99.spring_annotations.QualifierAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Pizza {

    private PizzaInterface pizzaInterface;

//
//    If we want to give SPicyPizza higher preference we can annotate it with @Primary , then no Qualifier is required
    @Autowired
    public Pizza(@Qualifier("tangyPizzaQualifier") PizzaInterface pizzaInterface){
        this.pizzaInterface = pizzaInterface;
    }

    //Spring doesnt allow multiple constructor Qualifier annotation!

//    @Autowired
//    public Pizza(@Qualifier("tangyPizzaQualifier") PizzaInterface pizzaInterface , boolean tangyRequired){
//        this.pizzaInterface = pizzaInterface;
//    }

    public String eatAndTastePizza(){
        System.out.println("Eat the pizza!");
        return pizzaInterface.tastePizza();

    }


}
