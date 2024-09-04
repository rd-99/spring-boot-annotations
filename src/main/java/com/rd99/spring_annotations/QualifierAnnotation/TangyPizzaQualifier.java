package com.rd99.spring_annotations.QualifierAnnotation;

import org.springframework.stereotype.Component;

@Component
public class TangyPizzaQualifier implements PizzaInterface{
    @Override
    public String tastePizza() {
        return "Tangy Pizza";
    }
    public void init(){
        System.out.println("init");
    }
    public void destroy(){
        System.out.println("destroy");
    }
}
