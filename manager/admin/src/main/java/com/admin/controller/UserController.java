package com.admin.controller;
import com.admin.dto.ParamsDTO;
import com.admin.dto.User;
import com.admin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * @author Administrator
 */
@RestController
@RequestMapping("/user")
@CrossOrigin
public class UserController {

    @Autowired
    private UserService userService;


    @GetMapping("/getInfo")
    @CrossOrigin
    public String getInfo(ParamsDTO params){
       List<User> info = userService.getInfo(params);
        return new String("我是admin");
    }
}
