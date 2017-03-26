package com.example.services;

import com.example.domain.Customer;
import com.example.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by shayanraouf on 3/25/2017.
 */

@Service
public class CustomerServices {

    private CustomerRepository customerRepository;

    @Autowired
    public CustomerServices(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public Customer createCustomer(String name, String address, String phoneNumber){
        Customer customer = new Customer(name,address,phoneNumber);
        if(!customerRepository.exists(customer.getID())){
            return customerRepository.save(customer);
        }
        throw new RuntimeException("does not exist");
    }

    public Iterable<Customer> lookup(){
        return customerRepository.findAll();
    }

    public long total(){
        return customerRepository.count();
    }


}
