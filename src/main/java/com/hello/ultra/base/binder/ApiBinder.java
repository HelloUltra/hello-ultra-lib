package com.hello.ultra.base.binder;

import com.hello.ultra.base.enums.API;

import java.beans.PropertyEditorSupport;

/**
 * Created by YG-MAC on 2017. 3. 4..
 */
public class ApiBinder extends PropertyEditorSupport {
    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        setValue(API.valueOf(text.toUpperCase()));
    }
}
