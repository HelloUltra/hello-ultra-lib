package com.hello.ultra.messenger.line;

import com.hello.ultra.base.anotation.ControllerCheck;
import com.hello.ultra.base.enums.API;
import com.hello.ultra.base.pojo.request.Request;
import com.hello.ultra.base.pojo.response.Response;
import com.hello.ultra.messenger.BaseMessenger;

/**
 * Created by YG-MAC on 2017. 2. 12..
 */
@ControllerCheck(type = API.LINE)
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
