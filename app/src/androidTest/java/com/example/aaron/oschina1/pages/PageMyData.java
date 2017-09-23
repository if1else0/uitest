package com.example.aaron.oschina1.pages;

import android.support.test.uiautomator.UiObject2;

import com.example.aaron.oschina1.common.Helper;

/**
 * Created by Aaron on 2017/9/17.
 */

public class PageMyData {
    Helper helper;

    public PageMyData(Helper helper){
        this.helper = helper;
    }

    public UiObject2 getBackBtn(){
        return  helper.findByContentDesc("Navigate up");
    }

    public UiObject2 getNickNameTv(){
        return helper.findById("net.oschina.app:id/tv_nickname");
    }

    public void clickBackBtn(){
        helper.click(getBackBtn());
    }

    public void clickNickNameTv(){
        helper.click(getNickNameTv());
    }

}
