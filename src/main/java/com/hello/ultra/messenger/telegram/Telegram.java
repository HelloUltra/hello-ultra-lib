package com.hello.ultra.messenger.telegram;

import com.hello.ultra.messenger.BaseMessenger;
import com.hello.ultra.base.request.Request;
import com.hello.ultra.base.response.Response;
import org.telegram.telegrambots.api.methods.send.SendMessage;
import org.telegram.telegrambots.api.objects.Update;

/**
 * Created by YG-MAC on 2017. 2. 12..
 */
public class Telegram extends BaseMessenger<Update, SendMessage> {
    @Override
    public Request receive(Update request) {
        return null;
    }

    @Override
    public SendMessage transmit(Response response) {
        return null;
    }
}
