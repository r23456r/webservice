package com.bochtec.service;

import javax.jws.WebMethod;

public interface IWebservice {

    @WebMethod
    String getName(Integer code);
}
