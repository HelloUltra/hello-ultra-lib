package com.hello.ultra.messenger.kakao;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by YG-MAC on 2017. 2. 12..
 */
public class KakaoRequest {
    public KakaoRequest() {
    }

    public KakaoRequest(String userKey, String type, String content) {
        this.userKey = userKey;
        this.type = type;
        this.content = content;
    }

    private String userKey;
    private String type;
    private String content;

    public String getContent() {
        return content;
    }
}
