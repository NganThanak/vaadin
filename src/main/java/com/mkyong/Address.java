package com.mkyong;

import org.springframework.stereotype.Component;

/**
 * Created by Admin on 4/21/2017.
 */
@Component
public class Address {

    private String address="Wal street khmer";

    public String getAddress(){
        return this.address;
    }
}
