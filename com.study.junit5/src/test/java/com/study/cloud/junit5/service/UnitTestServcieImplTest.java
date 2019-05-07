package com.study.cloud.junit5.service;

import com.study.cloud.junit5.Junit5ApplicationTests;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

class UnitTestServcieImplTest extends Junit5ApplicationTests {
    @Autowired
    UnitTestServcieImpl unitTestServcie;
    @BeforeAll
    static void setUpaa() {
        int a =20;
        int b=a+1;
        System.out.println(b);
    }
    @BeforeEach
    void setUp() {
        int a =20;
        int b=a+2;
        System.out.println(b);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testAdd() {
       int s= unitTestServcie.testAdd(12,13);
       System.out.println(s);
    }
    @Test
    void testAdda() {
        int s= unitTestServcie.testAdd(12,14);
        System.out.println(s);
    }
}