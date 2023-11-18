package com.rungoop.web.reponsitory;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.rungoop.web.entity.User;
@Repository
public interface UserRepository extends JpaRepository<User, Long>{
    @Query("SELECT id from User u where u.account=?1")
    Long findUserByAccount(String account);
    // @Query
}
