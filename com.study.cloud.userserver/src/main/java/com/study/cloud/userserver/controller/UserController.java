package com.study.cloud.userserver.controller;

import com.study.cloud.userserver.server.feign.FeignUserServiceImpl;
import com.study.cloud.userserver.server.smodel.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
   private FeignUserServiceImpl feignUserService;
    @PostMapping("/query")
    public UserModel query(UserModel model) {

        return feignUserService.query(model);
    }

    @PostMapping("/queryage")
    public UserModel queryage(UserModel model, Integer bage) {
        return feignUserService.queryage(model);
    }
}
