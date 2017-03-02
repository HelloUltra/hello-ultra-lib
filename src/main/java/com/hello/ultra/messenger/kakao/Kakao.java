package com.hello.ultra.messenger.kakao;

import com.hello.ultra.base.anotation.ControllerCheck;
import com.hello.ultra.base.request.Request;
import com.hello.ultra.base.response.Response;
import com.hello.ultra.messenger.BaseMessenger;
import org.springframework.stereotype.Component;

/**
 * Created by YG-MAC on 2017. 2. 12..
 */
@Component
@ControllerCheck(type = "KAKAO")
public class Kakao extends BaseMessenger<KakaoRequest, KakaoResponse>{

    @Override
    public Request receive(KakaoRequest request) {
        return null;
    }

    @Override
    public KakaoResponse transmit(Response response) {
        return null;
    }
}
