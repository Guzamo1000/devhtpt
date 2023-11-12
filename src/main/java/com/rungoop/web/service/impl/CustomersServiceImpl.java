package com.rungoop.web.service.impl;

import com.rungoop.web.entity.Customer;
import com.rungoop.web.reponsitory.CustomerRepository;
import com.rungoop.web.service.CustomerService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class CustomersServiceImpl implements CustomerService{
    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public void deleteCustomer(long id) {
        // TODO Auto-generated method stub
        customerRepository.deleteById(id);
        
    }

    @Override
    public List<Customer> getAllCustomers() {
        // TODO Auto-generated method stub
        return customerRepository.findAll();
    }

    @Override
    public Customer saveCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public Customer getCustomerById(Long id) {
        // TODO Auto-generated method stub
        return customerRepository.findById(id).get();
    }

    @Override
    public Customer updaCustomer(Customer customer) {
        return customerRepository.save(customer);
    }


    

}
