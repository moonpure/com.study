package com.study.cloud.test.webflux.service;

import com.study.cloud.test.webflux.api.model.UserApiModel;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserSerivceImpl {
    public List<UserApiModel> query(UserApiModel param)
    {
        List<UserApiModel> userApiModels=new ArrayList<>();
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
    public UserApiModel queryId(Integer id)
    {
        //处理数据
        return new UserApiModel();
    }
    public UserApiModel queryOne(UserApiModel param)
    {
        //处理数据
        return param;
    }
    public Integer edit(UserApiModel param)
    {
        //处理数据
        return 1;
    }
    public Integer add(UserApiModel param)
    {
        //处理数据
        return 1;
    }
}
