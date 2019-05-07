package com.study.cloud.junit5.service;

import org.springframework.stereotype.Service;

@Service
public class UnitTestServcieImpl {
    public int testAdd(int a,int b)
    {
        return a+b;
    }
}
