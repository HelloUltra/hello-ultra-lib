package com.hello.ultra.messenger.line;

import com.hello.ultra.messenger.BaseMessenger;
import com.hello.ultra.base.request.Request;
import com.hello.ultra.base.response.Response;

/**
 * Created by YG-MAC on 2017. 2. 12..
 */
public class Line extends BaseMessenger<LineRequest, LineResponse>{
    @Override
    public Request receive(LineRequest request) {
        return null;
    }

    @Override
    public LineResponse transmit(Response response) {
        return null;
    }
}