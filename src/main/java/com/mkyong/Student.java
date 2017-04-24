package com.mkyong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Admin on 4/21/2017.
 */
@Component
public class Student {

    @Autowired
    private Address address;

    public String showInfo(){
        return this.address.getAddress();
    }

}
