package com.rd99.spring_annotations.config;

import com.rd99.spring_annotations.QualifierAnnotation.PizzaInterface;
import com.rd99.spring_annotations.QualifierAnnotation.TangyPizzaQualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(name = "tangyPizzaBean" , initMethod = "init" , destroyMethod = "destroy")
    public PizzaInterface tangyPizza(){
        return new TangyPizzaQualifier();
    }


}
