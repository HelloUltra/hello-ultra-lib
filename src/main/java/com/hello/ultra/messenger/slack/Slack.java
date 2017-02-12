package com.hello.ultra.messenger.slack;

import com.hello.ultra.messenger.BaseMessenger;
import com.hello.ultra.base.request.Request;
import com.hello.ultra.base.response.Response;
import org.springframework.stereotype.Component;

/**
 * Created by YG-MAC on 2017. 2. 12..
 */
@Component
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
