package com.hello.ultra.messenger.slack;

import com.hello.ultra.base.anotation.ControllerCheck;
import com.hello.ultra.base.enums.API;
import com.hello.ultra.base.pojo.request.Request;
import com.hello.ultra.base.pojo.response.Response;
import com.hello.ultra.messenger.BaseMessenger;

/**
 * Created by YG-MAC on 2017. 2. 12..
 */
@ControllerCheck(type = API.SLACK)
public class Slack extends BaseMessenger<SlackRequest, SlackResponse>{

    @Override
    public Request receive(SlackRequest request) {
        return null;
    }

    @Override
    public SlackResponse transmit(Response response) {
        return null;
    }

    @Override
    public Class<SlackRequest> getRequestClass() {
        return null;
    }
}
