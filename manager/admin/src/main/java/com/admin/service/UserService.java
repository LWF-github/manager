package com.admin.service;

import com.admin.dto.ParamsDTO;
import com.admin.dto.User;

import java.util.List;

public interface UserService {
    List<User> getInfo(ParamsDTO params);
}
