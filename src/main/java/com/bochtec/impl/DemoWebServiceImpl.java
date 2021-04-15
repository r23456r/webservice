package com.bochtec.impl;

import com.bochtec.service.IWebservice;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class DemoWebServiceImpl implements IWebservice {
    @Override
    @WebMethod
    public String getName(Integer code) {
        if (code == 1) {
            return "张三";
        }
        return "李四";
    }
}