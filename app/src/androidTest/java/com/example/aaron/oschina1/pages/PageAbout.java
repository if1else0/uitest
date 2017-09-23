package com.example.aaron.oschina1.pages;

import android.support.test.uiautomator.UiObject2;

import com.example.aaron.oschina1.common.Helper;

/**
 * Created by Aaron on 2017/9/17.
 */

public class PageAbout {
    private Helper helper;

    public  PageAbout(Helper helper){
        this.helper = helper;
    }

    public UiObject2 getBackBtn(){
        return  helper.findByContentDesc("Navigate up");
    }

    public UiObject2 getVersionTv(){
        return helper.findById("net.oschina.app:id/tv_version_name");
    }

    public String getCurrentVersion(){
       return helper.getTextOfTextView(getVersionTv());
    }

}
