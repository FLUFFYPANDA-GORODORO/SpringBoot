package com.gaurav.SpringBootDemo.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Alein {

    @Value("21")
    private int age;
    @Autowired
//    @Qualifier("laptop")
    private Computer comp;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Computer getComp() {
        return comp;
    }

    public void setComp(Computer comp) {
        this.comp = comp;
    }

    public void code(){
        System.out.println("Coding....");
        comp.compile();
    }
}
