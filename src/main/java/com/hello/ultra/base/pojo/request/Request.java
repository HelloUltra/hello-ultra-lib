package com.hello.ultra.base.pojo.request;

import com.hello.ultra.base.pojo.BaseNetwork;

/**
 * Created by YG-MAC on 2017. 2. 12..
 */
public class Request extends BaseNetwork {
    public Request(String message, String room) {
        super(room);
        this.message = message;
    }

    private String message;
}
