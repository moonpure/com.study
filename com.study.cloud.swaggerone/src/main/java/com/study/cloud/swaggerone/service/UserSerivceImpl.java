package com.study.cloud.swaggerone.service;

import com.study.cloud.swaggerone.model.UserModel;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserSerivceImpl {
    public List<UserModel> query(UserModel param)
    {
        List<UserModel> userApiModels=new ArrayList<>();
        userApiModels.add(param);
        for(int i=0;i<10;i++)
        {
            userApiModels.add(param);
        }
        try {
            Thread.sleep(10000);
        }catch (Exception ex)
        {
            ex.printStackTrace();
        }
        //处理数据
        return userApiModels;
    }
    public UserModel queryId(Integer id)
    {
        //处理数据
        return new UserModel();
    }
    public UserModel queryOne(UserModel param)
    {
        //处理数据
        return param;
    }
    public Integer edit(UserModel param)
    {
        //处理数据
        return 1;
    }
    public Integer add(UserModel param)
    {
        //处理数据
        return 1;
    }
}
