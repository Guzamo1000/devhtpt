package com.rungoop.web.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rungoop.web.entity.User;
import com.rungoop.web.reponsitory.UserRepository;
import com.rungoop.web.service.UserService;
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> getAllUser() {
        // TODO Auto-generated method stub
        return userRepository.findAll();
    }

    @Override
    public User getUserById(long id) {
        // TODO Auto-generated method stub
        return userRepository.findById(id).get();
    }

    @Override
    public User saveUser(User user) {
        // TODO Auto-generated method stub
        return userRepository.save(user);
    }

    @Override
    public void deleteUser(long id) {
        // TODO Auto-generated method stub
        userRepository.deleteById(id);
    }

    @Override
    public Long getUserByAccount(String account) {
        // TODO Auto-generated method stub
        return userRepository.findUserByAccount(account);
    }

    
}
