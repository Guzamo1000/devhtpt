package com.rungoop.web.service.impl;

import com.rungoop.web.entity.Customer;
import com.rungoop.web.reponsitory.CustomerRepository;
import com.rungoop.web.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CustomersServiceImpl implements CustomerService {
    private CustomerRepository customerRepository;

    @Override
    public List<Customer> findAllCustomers() {
        return null;
    }
//    @Autowired
//    public CustomersServiceImpl(CustomerService customerService) {
//        this.customerService = customerService;
//    }
//    @Override
//    public List<Customer> findAllCustomers(){
//        List<Customer> customer= customerRepository.findAll(Customer);
//        return customer.stream().map((customer1 -> ))
//    }
}
