package com.bochtec.base;

import com.bochtec.impl.DemoWebServiceImpl;

import javax.xml.ws.Endpoint;

/**
 * @author: zhangyuhang
 * @modified By：
 * @date ：Created in 2021/4/15 16:46
 * @description：
 **/
public class Boot {

    public static void main(String[] args) {
        //设置webservice地址
        String address = "http://localhost:9090/webservice";
        //发布webservice
        Endpoint.publish(address, new DemoWebServiceImpl());
        System.out.println("hello world");
    }
}
