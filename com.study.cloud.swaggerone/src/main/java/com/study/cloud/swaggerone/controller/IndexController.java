package com.study.cloud.swaggerone.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 添加以下方法只是不报错了，未知原因
 */
@RestController
@RequestMapping("/")
public class IndexController {

    @GetMapping("/")
    public String Index()
    {
        return "Index";
    }
    @GetMapping("/csrf")
    public Map<String,String> Csrf()
    {
        Map<String,String> rm=new LinkedHashMap<>();
        rm.put("token","token");
        return rm;
    }
}
