package com.itheima.reggie.common;

/*
    自定义业务异常
 * @author 胡国兴
 * @version 1.0
 */
public class CustomException extends RuntimeException{

    public CustomException(String message){
        super(message);
    }
}
