package com.hello.ultra.receiver;

import com.hello.ultra.base.MessengerFactory;
import com.hello.ultra.base.enums.API;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Component;

/**
 * Created by YG-MAC on 2017. 2. 12..
 */
@Component
public class Gateway {
    @Autowired
    private MessengerFactory messengerFactory;


    public Object proceed(HttpRequest httpRequest, Object object){
        return proceed(resolve(httpRequest), object);
    }

    public Object proceed(API api, Object object){
        return messengerFactory
                .get(api)
                .proceed(object);
    }

    private API resolve(HttpRequest httpRequest){
        return null;
    }
}
