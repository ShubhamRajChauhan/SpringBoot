package com.telusko.myApp;


import org.springframework.stereotype.Component;

@Component // if we comment component here it pickup Laptop and  viceversa
public class Desktop implements Computer {

    public void compile() {

        System.out.println("Compiling with 404 bugs but faster");
    }
}
