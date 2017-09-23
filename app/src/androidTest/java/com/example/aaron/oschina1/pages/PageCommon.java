package com.example.aaron.oschina1.pages;

import android.support.test.uiautomator.UiObject2;

import com.example.aaron.oschina1.common.Helper;

/**
 * Created by Aaron on 2017/9/17.
 */

/**
 * 每个Page类会对当前页面的控件以及对该页面控件的操作进行封装
 */
public class PageCommon {
    private Helper helper;

    public PageCommon(Helper helper){
        this.helper = helper;
    }

    public UiObject2 getHomeTab(){
        return helper.findById("net.oschina.app:id/nav_item_news");
    }

    public UiObject2 getMomentTab(){
        return  helper.findById("net.oschina.app:id/nav_item_tweet");
    }

    public UiObject2 getPublishBtn(){
        return helper.findById("net.oschina.app:id/nav_item_tweet_pub");
    }

    public UiObject2 getExploreBtn(){
        return helper.findById("net.oschina.app:id/nav_item_explore");
    }

    public UiObject2 getMyTab(){
        return helper.findById("net.oschina.app:id/nav_item_me");
    }

    public void goToHomeTab(){
        helper.click(getHomeTab());
    }

    public void goToMomentTab(){
        helper.click(getMomentTab());
    }

    public  void clickPublishBtn(){
        helper.click(getPublishBtn());
    }

    public  void goToExploreTab(){
        helper.click(getExploreBtn());
    }

    public void goToMyTab(){
        helper.click(getMyTab());
    }

}
