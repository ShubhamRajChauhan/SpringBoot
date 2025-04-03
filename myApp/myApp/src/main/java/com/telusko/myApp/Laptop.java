package com.telusko.myApp;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary //now it will prefer Laptop if both Laptop and Desktop have @Component
public class Laptop implements Computer {

    public void compile() {

        System.out.println("Compiling with 404 bugs");
    }
}
