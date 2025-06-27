package com.gaurav.SpringBootDemo.repo;

import com.gaurav.SpringBootDemo.model.Laptop;
import org.springframework.stereotype.Repository;

@Repository
public class LaptopRepository {
    //JDBC code -> Handle request response of database , Ex : CRUD operations
    public void save(Laptop lap){
        System.out.println("Saved in database");
    }
}
