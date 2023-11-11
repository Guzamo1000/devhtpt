package com.rungoop.web.service;

import com.rungoop.web.entity.Customer;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface CustomerService {
    List<Customer> findAllCustomers();

}
