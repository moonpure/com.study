package com.study.cloud.swaggerone.controller;


import com.study.cloud.swaggerone.model.UserModel;
import com.study.cloud.swaggerone.service.UserSerivceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
@Api(value = "User", description = "用户")
public class UserController {
    @Autowired
    UserSerivceImpl userSerivce;
    @PostMapping("/query")
    @ApiOperation(value = "查询", notes = "查询列表")
    @ApiParam(name = "model", value = "用户实体", required = true)
    public List<UserModel> query(UserModel model) {
        return userSerivce.query(model);
    }
    @PostMapping("/queryone")
    @ApiOperation(value = "查询", notes = "查询一个实体")
    @ApiParam(name = "model", value = "用户实体", required = true)
    public UserModel queryOne(UserModel model) {

        return userSerivce.queryOne(model);
    }
    @GetMapping("/queryid")
    @ApiOperation(value = "查询", notes = "id查询")
    @ApiParam(name = "id", value = "用户id", required = true)
    public UserModel queryId(Integer id) {

        return userSerivce.queryId(id);
    }
    @PostMapping("/add")
    @ApiOperation(value = "添加", notes = "添加数据")
    @ApiParam(name = "model", value = "用户实体", required = true)
    public Integer add(UserModel model) {

        return userSerivce.add(model);
    }
    @PostMapping("/edit")
    @ApiOperation(value = "修改", notes = "修改数据")
    @ApiParam(name = "model", value = "用户实体", required = true)
    public Integer edit(UserModel model) {

        return userSerivce.edit(model);
    }
}
