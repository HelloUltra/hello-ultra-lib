package com.hello.ultra.base.pojo.response;

import com.hello.ultra.base.pojo.BaseNetwork;

/**
 * Created by YG-MAC on 2017. 2. 12..
 */
public class Response extends BaseNetwork{
    public Response(String message, BaseNetwork baseNetwork) {
        super(baseNetwork);
        this.message = message;
    }
    private String message;

    public String getMessage() {
        return message;
    }
}
