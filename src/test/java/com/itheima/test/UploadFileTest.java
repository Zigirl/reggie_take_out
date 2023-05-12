package com.itheima.test;

import org.junit.jupiter.api.Test;

/*
 * @author 胡国兴
 * @version 1.0
 */
public class UploadFileTest {

    @Test
    public void test1(){
        String fileName = "errooee.jpg";

        String suffix = fileName.substring(fileName.lastIndexOf("."));
        System.out.println(suffix);
    }
}
