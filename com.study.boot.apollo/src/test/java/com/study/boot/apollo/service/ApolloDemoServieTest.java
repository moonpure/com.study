package com.study.boot.apollo.service;

import com.ctrip.framework.apollo.Config;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class ApolloDemoServieTest {
    @Autowired
    ApolloDemoServie apolloDemoServie;

    @Test
    public void getConfig() {
        Config config=apolloDemoServie.getConfig();
        int timeout=config.getIntProperty("timeout",0);
        System.out.print(timeout);
        System.out.print(config.getProperty("url","null"));
    }
}