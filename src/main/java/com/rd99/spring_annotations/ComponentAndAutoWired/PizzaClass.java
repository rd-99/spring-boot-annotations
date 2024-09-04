package com.rd99.spring_annotations.ComponentAndAutoWired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("DemoBean-PizzaClass")
public class PizzaClass {

    /// Field injection

//    @Autowired
    private SpicyPizza spicyPizza;


//Constructor injection

//    @Autowired
//    PizzaClass(SpicyPizza spicyPizza){
//        this.spicyPizza = spicyPizza;
//    }

    //setter injection
//    @Autowired
//    public void setSpicyPizza(SpicyPizza spicyPizza) {
//        this.spicyPizza = spicyPizza;
//    }

    public String tastePizza(){
        return spicyPizza.tastePizza();
    }

}
