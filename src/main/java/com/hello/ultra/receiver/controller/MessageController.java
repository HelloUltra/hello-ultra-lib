package com.hello.ultra.receiver.controller;

import com.hello.ultra.base.enums.API;
import com.hello.ultra.receiver.Gateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by YG-MAC on 2017. 2. 12..
 */

@RestController
public class MessageController {
    @Autowired
    private Gateway gateway;

    @PostMapping("{api}/message")
    public Object message(@PathVariable API api, @RequestParam Object data) {
        return gateway.proceed(api, data);
    }
}
