package com.telusko.myApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Dev {

    @Autowired //Field injection : to connect Dev and Laptop classes
    @Qualifier("laptop") //to decide Laptop or Desktop , start with small letter if Laptop give laptop
    //private Laptop laptop;
    private Computer comp;

    //(OR) Constructor Injection
//    public Dev(Laptop laptop) {
//        this.laptop = laptop;
//    }



    //(OR) Setter Injection
//    @Autowired //here we need to inject autowired then it will work
//    public void setLaptop(Laptop laptop) {
//        this.laptop = laptop;
//    }

    public  void build(){
        //laptop.compile();
        comp.compile();
        System.out.println("Working on Awesome Project");
    }
}
