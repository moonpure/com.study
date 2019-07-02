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

    @Test
    public void quickSort() {
        int[] array=new int[]{25,15,30,10,50,3,5,60};
        apolloDemoServie.QuickSort(array, 0, array.length-1);
        for(int i=0;i<array.length;i++)
        {
            System.out.println((i+1)+"th:"+array[i]);
        }
    }
}