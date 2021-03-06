package com.theam.rest.api.service;

import com.theam.rest.api.model.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> findAll();
    Customer findById(Long id);
    Customer save(Customer customer);
    Customer update(Long id, Customer customer);
    void deleteById(Long customerId);
}
