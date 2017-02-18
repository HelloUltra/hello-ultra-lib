package com.hello.ultra.messenger;

import com.hello.ultra.base.ServiceConnector;
import com.hello.ultra.base.enums.API;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by YG-MAC on 2017. 2. 12..
 */
public abstract class BaseMessenger<T, K> implements Messenger<T, K>{

    private API api;

    public BaseMessenger(API api) {
        this.api = api;
    }

    public API getApi() {
        return api;
    }

    @Autowired
    private ServiceConnector serviceConnector;

    public K proceed(Object request){
        return transmit(
                serviceConnector.start(
                        receive((T) request)
                )
        );
    }
}
