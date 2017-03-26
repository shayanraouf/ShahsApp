package com.example.domain;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by shayanraouf on 3/25/2017.
 */
@Entity
@Table(name="BAKERY_ITEM")
public class BakeryItem {

    @Id
    @GeneratedValue
    private Integer id;


    @Column
    private String ingredients;

    @Column
    private Double price;

    @Column
    private Timestamp timestamp;

    public BakeryItem(String ingredients, Double price, Timestamp timestamp) {
        this.ingredients = ingredients;
        this.price = price;
        this.timestamp = timestamp;
    }
}