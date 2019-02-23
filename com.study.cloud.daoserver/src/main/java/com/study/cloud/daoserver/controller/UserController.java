package com.study.cloud.daoserver.controller;

import com.study.cloud.daoserver.model.UserModel;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {
    @PostMapping("/query")
    public UserModel query(UserModel model) {
        return model;
    }

    @PostMapping("/queryage")
    public UserModel queryage(UserModel model, Integer bage) {
        model.setAge(bage);
        return model;
    }
}
