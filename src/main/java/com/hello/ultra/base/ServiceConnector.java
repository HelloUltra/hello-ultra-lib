package com.hello.ultra.base;

import com.hello.ultra.base.request.Request;
import com.hello.ultra.base.response.Response;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * Created by YG-MAC on 2017. 2. 12..
 */
@Component
public class ServiceConnector {
    @PostConstruct
    public void init(){
        //하나의 서비스 연결 Method 탐색
        //Reflection 사용
    }

    public Response start(Request request){
        //탐색으로 가지고 있는 Method를 invoke
        return null;
    }
}
