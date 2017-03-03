package com.hello.ultra.messenger.slack;

import com.hello.ultra.base.anotation.ControllerCheck;
import com.hello.ultra.base.enums.API;
import com.hello.ultra.base.request.Request;
import com.hello.ultra.base.response.Response;
import com.hello.ultra.messenger.BaseMessenger;
import org.springframework.stereotype.Component;

/**
 * Created by YG-MAC on 2017. 2. 12..
 */
@Component
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
}
