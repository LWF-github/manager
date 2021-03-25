package com.admin.service.impl;

import com.admin.dto.ParamsDTO;
import com.admin.dto.User;
import com.admin.mapper.UserMapper;
import com.admin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getInfo(ParamsDTO params) {
        return userMapper.getInfo(params);
    }
}
