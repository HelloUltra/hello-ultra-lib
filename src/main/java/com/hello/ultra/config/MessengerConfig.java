package com.hello.ultra.config;

import com.hello.ultra.receiver.socket.TelegramSocket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.TelegramBotsApi;
import org.telegram.telegrambots.exceptions.TelegramApiException;
import javax.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by YG-MAC on 2017. 2. 12..
 */
@Configuration
public class MessengerConfig {

	private static final Logger logger = LoggerFactory.getLogger(MessengerConfig.class);

	@Bean
	TelegramSocket telegramSocket() {
		return new TelegramSocket();
	}

	@PostConstruct
	void telegramInitializer() {
		ApiContextInitializer.init();

		TelegramBotsApi botsApi = new TelegramBotsApi();

		try {
			botsApi.registerBot(telegramSocket());
		} catch (TelegramApiException e) {
			// 봇 네임, 토큰을 잘못 입력하였을경우.
			logger.error("telegramInitializerException - {}", e);
		}
	}
}
