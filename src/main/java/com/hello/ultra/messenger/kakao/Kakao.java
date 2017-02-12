package com.hello.ultra.messenger.kakao;

import com.hello.ultra.messenger.BaseMessenger;
import com.hello.ultra.base.request.Request;
import com.hello.ultra.base.response.Response;

/**
 * Created by YG-MAC on 2017. 2. 12..
 */
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
