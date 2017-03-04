package com.hello.ultra.base.pojo;

/**
 * Created by YG-MAC on 2017. 3. 3..
 */
public class BaseNetwork {
    public BaseNetwork(BaseNetwork baseNetwork) {
        this.room = baseNetwork.room;
    }

    public BaseNetwork(String room) {
        this.room = room;
    }

    private String room;

    public String getRoom() {
        return room;
    }
}
