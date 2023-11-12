package com.rungoop.web.reponsitory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rungoop.web.entity.User;
@Repository
public interface UserRepository extends JpaRepository<User, Long>{
    
}
