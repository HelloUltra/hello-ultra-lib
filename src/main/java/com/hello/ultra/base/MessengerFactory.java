package com.hello.ultra.base;

import com.hello.ultra.messenger.BaseMessenger;
import com.hello.ultra.base.enums.API;
import com.hello.ultra.messenger.Messenger;
import com.hello.ultra.messenger.kakao.Kakao;
import com.hello.ultra.messenger.line.Line;
import com.hello.ultra.messenger.slack.Slack;
import com.hello.ultra.messenger.telegram.Telegram;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by YG-MAC on 2017. 2. 12..
 */
@Component
public class MessengerFactory {
    private static final Logger logger = LoggerFactory.getLogger(MessengerFactory.class);

    @Autowired
    private Set<BaseMessenger> messengers;

    private static Map<API, Messenger> messenger = new HashMap<>();

    @PostConstruct
    public void init(){
        logger.info("MessengerFactory init()");
        messengers.stream().forEach(ms -> messenger.put(ms.getApi(), ms));
    }

    public BaseMessenger get(API api){
        return (BaseMessenger) messenger.get(api);
    }
}
