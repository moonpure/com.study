package com.study.boot.junittest;

import org.springframework.stereotype.Service;

@Service
public class UnitTestServcieImpl {
    public int testAdd(int a,int b)
    {
        return a+b;
    }
}
