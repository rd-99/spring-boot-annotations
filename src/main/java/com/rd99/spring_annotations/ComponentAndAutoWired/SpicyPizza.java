package com.rd99.spring_annotations.ComponentAndAutoWired;

import org.springframework.stereotype.Component;

@Component
public class SpicyPizza {
    public String tastePizza(){
        return "The pizza is spicy.";
    }
}
