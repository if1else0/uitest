package com.example.aaron.oschina1.pages;

import android.support.test.uiautomator.UiObject2;

import com.example.aaron.oschina1.common.Helper;

/**
 * Created by Aaron on 2017/9/17.
 */

public class PageHome {
    private Helper helper;

    public PageHome(Helper helper){
        this.helper = helper;
    }

    public UiObject2 getNewsItem(int index){
        return helper.findById("net.oschina.app:id/tv_title",index);
    }

    public void clickNewsItem(int index){
        helper.click(getNewsItem(index));
    }

}
