package com.cafuc.service.impl;

import com.cafuc.domain.User;
import com.cafuc.mapper.UserMapper;
import com.cafuc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public User Login(User user) {
        return userMapper.Login(user);
    }

    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }
}
