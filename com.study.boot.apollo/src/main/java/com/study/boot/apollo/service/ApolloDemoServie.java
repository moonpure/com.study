package com.study.boot.apollo.service;

import com.ctrip.framework.apollo.Config;
import com.ctrip.framework.apollo.spring.annotation.ApolloConfig;
import lombok.Data;
import org.springframework.stereotype.Service;

@Service
@Data
public class ApolloDemoServie {
    @ApolloConfig
    private Config config;

    public void quickSort(int[] array, int start, int end) {
        if (start >= end) {
            return;
        }
        int key = array[start];//初始化保存基元
        int i = start, j;//初始化i,j
        for (j = start + 1; j <= end; j++) {
            if (array[j] < key)//如果此处元素小于基元，则把此元素和i+1处元素交换，并将i加1，如大于或等于基元则继续循环
            {
                int temp = array[j];
                array[j] = array[i + 1];
                array[i + 1] = temp;
                i++;
            }

        }
        array[start] = array[i];//交换i处元素和基元
        array[i] = key;
        quickSort(array, start, i - 1);//递归调用
        quickSort(array, i + 1, end);


    }
    public  void quickSortSentinel(int[] arr,int low,int high){
        int i,j,temp,t;
        if(low>high){
            return;
        }
        i=low;
        j=high;
        //temp就是基准位
        temp = arr[low];

        while (i<j) {
            //先看右边，依次往左递减
            while (temp<=arr[j]&&i<j) {
                j--;
            }
            //再看左边，依次往右递增
            while (temp>=arr[i]&&i<j) {
                i++;
            }
            //如果满足条件则交换
            if (i<j) {
                t = arr[j];
                arr[j] = arr[i];
                arr[i] = t;
            }

        }
        //最后将基准为与i和j相等位置的数字交换
        arr[low] = arr[i];
        arr[i] = temp;
        //递归调用左半数组
        quickSortSentinel(arr, low, j-1);
        //递归调用右半数组
        quickSortSentinel(arr, j+1, high);
    }


}
