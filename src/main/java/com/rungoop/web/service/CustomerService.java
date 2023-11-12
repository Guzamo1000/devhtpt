package com.rungoop.web.service;

import com.rungoop.web.entity.Customer;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface CustomerService {
    List<Customer> getAllCustomers();

    Customer saveCustomer(Customer customer);

    Customer getCustomerById(Long id);

    Customer updaCustomer(Customer customer);

    void deleteCustomer(long id);
}
