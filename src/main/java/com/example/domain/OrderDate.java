package com.example.domain;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by shayanraouf on 3/25/2017.
 */
//@Entity
//@Table(name="ORDER_DATE")
@Entity
@Table(name="ORDER_DATE")
public class OrderDate {

    @Id
    @GeneratedValue
    private Integer id;

    @Column
    private Date orderDate;

    @Column
    private Date requestedDate;

    public OrderDate(Date orderDate, Date requestedDate) {
        this.orderDate = orderDate;
        this.requestedDate = requestedDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Date getRequestedDate() {
        return requestedDate;
    }

    public void setRequestedDate(Date requestedDate) {
        this.requestedDate = requestedDate;
    }



}