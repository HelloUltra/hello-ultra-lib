package com.hello.ultra.receiver.controller;

import com.hello.ultra.base.binder.ApiBinder;
import com.hello.ultra.base.enums.API;
import com.hello.ultra.receiver.Gateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

/**
 * Created by YG-MAC on 2017. 2. 12..
 */

@RestController
public class MessageController {
    @Autowired
    private Gateway gateway;

    @InitBinder
    void initBinder(final WebDataBinder binder){
        binder.registerCustomEditor(API.class, new ApiBinder());
    }

    @PostMapping("/{api}/message")
    public Object message(@PathVariable API api, @RequestBody Object data) {
        return gateway.proceed(api, data);
    }
}
