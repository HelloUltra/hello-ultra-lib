package com.hello.ultra.base;

import com.hello.ultra.messenger.BaseMessenger;
import com.hello.ultra.base.enums.API;
import org.springframework.stereotype.Component;

/**
 * Created by YG-MAC on 2017. 2. 12..
 */
@Component
public class MessengerFactory {
    public BaseMessenger get(API api){
        return null;
    }
}
