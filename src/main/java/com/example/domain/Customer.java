package com.example.domain;

import javax.persistence.*;

/**
 * Created by shayanraouf on 3/25/2017.
 */

@Entity
@Table(name="CUSTOMER")
public class Customer {

    @Id
    @GeneratedValue
    private Integer id;

    @Column
    private String name;

    @Column
    private String address;

    @Column
    private String phoneNumber;

    public Customer(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public int getID(){
        return id;
    }

}