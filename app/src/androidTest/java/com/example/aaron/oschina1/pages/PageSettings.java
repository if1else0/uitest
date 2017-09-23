package com.example.aaron.oschina1.pages;

import android.support.test.uiautomator.UiObject2;

import com.example.aaron.oschina1.common.Helper;

/**
 * Created by Aaron on 2017/9/17.
 */

public class PageSettings {
    private Helper helper;

    public PageSettings(Helper helper){
        this.helper = helper;
    }

    public UiObject2 getBackBtn(){
        return helper.findByContentDesc("Navigate up");
    }

    public UiObject2 getFeedBackTv(){
        return helper.findById("net.oschina.app:id/rl_feedback");
    }

    public UiObject2 getAboutTv(){
        return helper.findById("net.oschina.app:id/rl_about");
    }

    public UiObject2 getLogoutTv(){
        return helper.findById("net.oschina.app:id/rl_cancel");
    }

    public void clickBackBtn(){
        helper.click(getBackBtn());
    }

    public void clickFeedBackItem(){
        helper.click(getFeedBackTv());
    }

    public void clickAboutItem(){
        helper.click(getAboutTv());
    }

    public void clickLogoutItem(){
        helper.click(getLogoutTv());
    }

}
