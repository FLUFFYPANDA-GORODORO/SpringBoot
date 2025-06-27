package com.gaurav.SpringBootDemo.service;

import com.gaurav.SpringBootDemo.LaptopRepository;
import com.gaurav.SpringBootDemo.model.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {

    @Autowired
    private LaptopRepository repo;

    public void addLaptop(Laptop lap) {
        //In this we have to add laptop into the database
        System.out.println("Method called");
        repo.save(lap);
    }
    public boolean isGood(Laptop lap){
        return true;
    }
}
