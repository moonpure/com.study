package com.study.cloud.userserver.server.feign;

import com.study.cloud.userserver.server.smodel.UserModel;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient("daoservice")
public interface FeignUserServiceImpl {
    @PostMapping("/user/query")
    UserModel query(UserModel model);

    @PostMapping("/user/queryage")
     UserModel queryage(UserModel model) ;
}
