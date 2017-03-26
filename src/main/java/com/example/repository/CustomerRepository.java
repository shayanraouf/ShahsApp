package com.example.repository;

import com.example.domain.Customer;
import org.hibernate.persister.entity.Loadable;
import org.springframework.data.repository.CrudRepository;

import javax.persistence.criteria.CriteriaBuilder;

/**
 * Created by shayanraouf on 3/25/2017.
 */
public interface CustomerRepository extends CrudRepository<Customer,Integer>{
}
