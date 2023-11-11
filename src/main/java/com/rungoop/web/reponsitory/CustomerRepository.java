package com.rungoop.web.reponsitory;//package com.example.demo.reponsitory;


import com.rungoop.web.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    
}
