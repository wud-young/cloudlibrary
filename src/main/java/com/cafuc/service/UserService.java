package com.cafuc.service;

import com.cafuc.domain.User;
import entity.PageResult;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {
    User Login(User user);
    List<User> findAll();
    PageResult selectNewUser(Integer pageNum, Integer pageSize);
}
