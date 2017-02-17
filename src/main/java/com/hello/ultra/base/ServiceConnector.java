package com.hello.ultra.base;

import com.hello.ultra.base.request.Request;
import com.hello.ultra.base.response.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * Created by YG-MAC on 2017. 2. 12..
 */
@Component
public class ServiceConnector {

    private static final Logger logger = LoggerFactory.getLogger(ServiceConnector.class);


    @PostConstruct
    public void init(){
        logger.info("ServiceConnector init()");
        //하나의 서비스 연결 Method 탐색
        //Reflection 사용
    }

    public Response start(Request request){
        //탐색으로 가지고 있는 Method를 invoke

        logger.info("ServiceConnector start");

        Response response = new Response();
        response.setMessage("return message");

        return response;
    }
}
