package com.hello.ultra.receiver.socket;

import com.hello.ultra.base.enums.API;
import com.hello.ultra.receiver.Gateway;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.api.methods.send.SendMessage;
import org.telegram.telegrambots.api.objects.Update;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.exceptions.TelegramApiException;

import javax.annotation.PostConstruct;

/**
 * Created by YG-MAC on 2017. 2. 12..
 */
public class TelegramSocket extends TelegramLongPollingBot {
    private static final Logger logger = LoggerFactory.getLogger(TelegramSocket.class);

    @Autowired
    private Gateway gateway;

    @Override
    public void onUpdateReceived(Update update) {
        if (update.hasMessage() && update.getMessage().hasText()) {
            try {
                sendMessage((SendMessage) gateway.proceed(API.TELEGRAM, update)); // Call method to send the message
            } catch (TelegramApiException e) {
                logger.error("TelegramApiException - {}", e);
            }
        }

    }

    @Override
    public String getBotUsername() {
        return null;
    }

    @Override
    public String getBotToken() {
        return null;
    }
}
