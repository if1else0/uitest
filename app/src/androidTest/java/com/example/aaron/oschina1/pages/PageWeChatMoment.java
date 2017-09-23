package com.example.aaron.oschina1.pages;

import android.support.test.uiautomator.UiObject2;

import com.example.aaron.oschina1.common.Helper;

/**
 * Created by Aaron on 2017/9/17.
 */

public class PageWeChatMoment {
    private Helper helper;

    public PageWeChatMoment(Helper helper){
        this.helper = helper;
    }

    public UiObject2 getMomentContentEditText(){
        return helper.findById("com.tencent.mm:id/cvw");
    }

    public void setMomentContent(String content){
        helper.enterText(getMomentContentEditText(),content);
    }
}
