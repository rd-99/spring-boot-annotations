package com.rd99.spring_annotations.QualifierAnnotation;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
        //@Primary(If Qualifier use need to be avoided)
public class SpicyPizzaQualifier implements PizzaInterface{
    @Override
    public String tastePizza() {
        return "Spiced Pizza";
    }
}
