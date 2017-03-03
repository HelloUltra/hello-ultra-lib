package com.hello.ultra.messenger.kakao;

import com.hello.ultra.base.anotation.ControllerCheck;
import com.hello.ultra.base.enums.API;
import com.hello.ultra.base.pojo.request.Request;
import com.hello.ultra.base.pojo.response.Response;
import com.hello.ultra.messenger.BaseMessenger;

/**
 * Created by YG-MAC on 2017. 2. 12..
 */
@ControllerCheck(type = API.KAKAO)
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
