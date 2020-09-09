package com.sujata.demo;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT)
public class Hello {

    @WebMethod
    @WebResult(name = "demoResponse")
    public String greet(@WebParam(name="yourname") String name) {
        return "Welcome "+ name+" to our first Jax WS Demo!!";
    }
}