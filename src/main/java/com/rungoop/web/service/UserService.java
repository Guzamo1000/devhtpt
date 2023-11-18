package com.rungoop.web.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.rungoop.web.entity.User;
@Service
public interface UserService {
    List<User> getAllUser();

    User getUserById(long id);

    User saveUser(User user);

    void deleteUser(long id);

    Long getUserByAccount(String account);
}
