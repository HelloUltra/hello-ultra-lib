package com.hello.ultra.receiver;

import com.hello.ultra.base.MessengerFactory;
import com.hello.ultra.base.enums.API;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by YG-MAC on 2017. 2. 12..
 */
@Component
public class Gateway {

    private static final Logger logger = LoggerFactory.getLogger(Gateway.class);

    @Autowired
    private MessengerFactory messengerFactory;

    public Object proceed(API api, Object object){
        logger.info("Gateway proceed start : {}", api);
        return messengerFactory
                .get(api)
                .proceed(object);
    }
}
