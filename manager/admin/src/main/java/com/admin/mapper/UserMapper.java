package com.admin.mapper;

import com.admin.dto.ParamsDTO;

import com.admin.dto.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;


import java.util.List;

public interface UserMapper extends BaseMapper<User> {

    List<User> getInfo(ParamsDTO params);
}
