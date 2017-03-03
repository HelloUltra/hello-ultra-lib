package com.hello.ultra.messenger.kakao;

/**
 * Created by YG-MAC on 2017. 2. 12..
 */
public class KakaoResponse {
    private String text;
    private Photo photo;
    private MessageButton messageButton;

    public String getText() {
        return text;
    }

    public KakaoResponse() {
    }

    public KakaoResponse(String text, Photo photo, MessageButton messageButton){
        this.text = text;
        this.photo = photo;
        this.messageButton = messageButton;
    }

    static class Photo {
        private String url;
        private Integer width;
        private Integer height;
    }

    static class MessageButton {
        private String label;
        private String url;
    }

}
