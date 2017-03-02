package com.hello.ultra.messenger;

import com.hello.ultra.base.ServiceConnector;
import com.hello.ultra.base.anotation.ControllerCheck;
import com.hello.ultra.base.enums.API;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by YG-MAC on 2017. 2. 12..
 */
public abstract class BaseMessenger<T, K> implements Messenger<T, K>{

    private static final Logger logger = LoggerFactory.getLogger(BaseMessenger.class);

    private API api;

    public API getApi() {
        return api;
    }

    public BaseMessenger() {
        ControllerCheck type = getClass().getAnnotation(ControllerCheck.class);
        logger.info("type : {}" , type.type());
        this.api = API.valueOf(type.type());
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
