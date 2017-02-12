package com.hello.ultra.config;

import com.hello.ultra.receiver.socket.TelegramSocket;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.TelegramBotsApi;
import org.telegram.telegrambots.exceptions.TelegramApiRequestException;

/**
 * Created by YG-MAC on 2017. 2. 12..
 */
@Configuration
public class MessengerConfig {
    @Bean
    TelegramSocket telegramSocket(){
        return new TelegramSocket();
    }

    @Bean
    TelegramBotsApi botsApi() throws TelegramApiRequestException {
        ApiContextInitializer.init();
        TelegramBotsApi botsApi = new TelegramBotsApi();
        botsApi.registerBot(telegramSocket());
        return botsApi;
    }
}
