package com.study.boot.matrixcode.controller;

import com.study.boot.matrixcode.service.QRCodeUtil;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.*;
@SpringBootTest
public class IndexControllerTest {

    @Test
    public void createMatrixCode() throws Exception {
        // 存放在二维码中的内容
       String text = "http://13691297331.3vzhuji.net/huangqijuncard.jpg";
        //String text = "http://www.baidu.com";
        // 嵌入二维码的图片路径
        String imgPath =null;// "/homefile/qrCode/dog.jpg";
        // 生成的二维码的路径及名称
        String destPath = "/homefile/qrCode/qrcode/huangqijunimg.jpg";
        //生成二维码
        QRCodeUtil.encode(text, imgPath, destPath, true);
        // 解析二维码
        String str = QRCodeUtil.decode(destPath);
        // 打印出解析出的内容
        System.out.println(str);

    }
}