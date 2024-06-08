package com.cafuc.service.impl;

import com.cafuc.domain.Equipment;
import com.cafuc.domain.User;
import com.cafuc.mapper.UserMapper;
import com.cafuc.service.UserService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import entity.PageResult;
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
    public PageResult selectNewUser(Integer pageNum, Integer pageSize) {
        // 设置分页查询的参数，开始分页
        PageHelper.startPage(pageNum, pageSize);
        Page<User> page=userMapper.findAll();
        return new PageResult(page.getTotal(),page.getResult());
    }
    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }
}
