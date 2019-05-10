package com.study.boot.junittest;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

class UnitTestServcieImplTest extends JunittestApplicationTests {
    @Autowired
    UnitTestServcieImpl unitTestServcie;
    @BeforeAll
     void setUpaa() {
        int a =20;
        int b=a+1;
        System.out.println(b);
        int s= unitTestServcie.testAdd(1,13);
        System.out.println(s);
    }
    @BeforeEach
    void setUp() {
        int a =20;
        int b=a+2;
        System.out.println(b);
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