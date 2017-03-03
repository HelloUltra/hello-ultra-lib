package com.hello.ultra.messenger.telegram;

import com.hello.ultra.base.anotation.ControllerCheck;
import com.hello.ultra.base.enums.API;
import com.hello.ultra.base.pojo.request.Request;
import com.hello.ultra.base.pojo.response.Response;
import com.hello.ultra.messenger.BaseMessenger;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.telegram.telegrambots.api.methods.send.SendMessage;
import org.telegram.telegrambots.api.objects.Update;

/**
 * Created by YG-MAC on 2017. 2. 12..
 */
@ControllerCheck(type = API.TELEGRAM)
public class Telegram extends BaseMessenger<Update, SendMessage> {

    private static final Logger logger = LoggerFactory.getLogger(Telegram.class);

    @Override
    public Request receive(Update request) {
        logger.info("receive request.getMessage() : {}", request.getMessage());
        return new Request(request.getMessage().getText(), String.valueOf(request.getMessage().getChatId()));
    }

    @Override
    public SendMessage transmit(Response response) {
        logger.info("transmit response.getMessage() : {}", response.getMessage());
        return new SendMessage().setText(response.getMessage()).setChatId(response.getRoom());
    }

    @Override
    public Class<Update> getRequestClass() {
        return Update.class;
    }
}
