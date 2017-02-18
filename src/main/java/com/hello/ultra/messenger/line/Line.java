package com.hello.ultra.messenger.line;

import com.hello.ultra.base.enums.API;
import com.hello.ultra.messenger.BaseMessenger;
import com.hello.ultra.base.request.Request;
import com.hello.ultra.base.response.Response;
import org.springframework.stereotype.Component;

/**
 * Created by YG-MAC on 2017. 2. 12..
 */
@Component
public class Line extends BaseMessenger<LineRequest, LineResponse>{

    public Line() {
        super (API.LINE);
    }

    @Override
    public Request receive(LineRequest request) {
        return null;
    }

    @Override
    public LineResponse transmit(Response response) {
        return null;
    }
}
