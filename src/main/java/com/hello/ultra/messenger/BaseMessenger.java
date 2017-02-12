package com.hello.ultra.messenger;

import com.hello.ultra.base.ServiceConnector;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by YG-MAC on 2017. 2. 12..
 */
public abstract class BaseMessenger<T, K> implements Messenger<T, K>{

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
