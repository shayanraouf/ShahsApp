package com.example.domain;

import javax.persistence.*;

/**
 * Created by shayanraouf on 3/25/2017.
 */
//@Entity
//@Table(name="ORDER")
@Entity
public class Order {

    @Id
    private Integer id;


    //@JoinColumn(name="id", table = "BAKERY_ITEM")
    @Column
    private Integer bakeryItemID;

    //@JoinColumn(name="id", table = "ORDER_DATE")
    @Column
    private Integer orderDateID;

    public Order(Integer bakeryItemID, Integer orderDateID) {
        this.bakeryItemID = bakeryItemID;
        this.orderDateID = orderDateID;
    }
}