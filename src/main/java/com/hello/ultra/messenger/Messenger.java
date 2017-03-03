package com.hello.ultra.messenger;

import com.hello.ultra.base.pojo.request.Request;
import com.hello.ultra.base.pojo.response.Response;

/**
 * Created by YG-MAC on 2017. 2. 12..
 */
public interface Messenger<T, K> {
    Request receive(T request);
    K transmit(Response response);
}
