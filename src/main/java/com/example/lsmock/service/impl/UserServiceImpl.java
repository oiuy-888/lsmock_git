package com.example.lsmock.service.impl;

import com.example.lsmock.dao.User;
import com.example.lsmock.mapper.UserMapper;
import com.example.lsmock.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }

    @Override
    public User findByName(User user) {
        return userMapper.findByName(user);
    }

}