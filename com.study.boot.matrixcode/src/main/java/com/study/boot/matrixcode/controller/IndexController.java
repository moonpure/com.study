package com.study.boot.matrixcode.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
    @RequestMapping("/index")
    public String createMatrixCode()
    {
        return "test";
    }

}
