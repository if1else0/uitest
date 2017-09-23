package com.example.aaron.oschina1.pages;

import android.support.test.uiautomator.UiObject2;

import com.example.aaron.oschina1.common.Helper;

/**
 * Created by Aaron on 2017/9/17.
 */

public class PageMy {
    private Helper helper;

    public PageMy(Helper helper){
        this.helper = helper;
    }

    public UiObject2 getLoginIcon(){
        return helper.findById("net.oschina.app:id/iv_portrait");
    }

    public UiObject2 getMyMsgItem(){
        return helper.findById("net.oschina.app:id/rl_message");
    }

    public UiObject2 getMyDatItem(){
        return helper.findById("net.oschina.app:id/rl_data");
    }

    public UiObject2 getMyBlogItem(){
        return helper.findById("net.oschina.app:id/rl_blog");
    }

    public UiObject2 getMyQAItem(){
        return helper.findById("net.oschina.app:id/rl_info_question");
    }

    public UiObject2 getMyActivityItem(){
        return helper.findById("net.oschina.app:id/rl_info_activities");
    }

    public UiObject2 getMyTeamItem(){
        return helper.findById("net.oschina.app:id/rl_info_activities");
    }

    public UiObject2 getMySettingsIcon(){
        return helper.findById("net.oschina.app:id/iv_logo_setting");
    }

    public UiObject2 getNickNameTv(){
        return helper.findById("net.oschina.app:id/tv_nick");
    }

    public UiObject2 getFavorites(){
        return  helper.findById("net.oschina.app:id/ly_favorite");
    }

    /**
     * 封装各个点击该页面控件的方法
     */

    public void clickLoginIcon(){
        helper.click(getLoginIcon());
    }

    public void clickMyMsgItem(){
        helper.click(getMyMsgItem());
    }

    public void clickMyDataItem(){
        helper.click(getMyDatItem());
    }

    public void clickMyBlogItem(){
        helper.click(getMyBlogItem());
    }

    public void clickMyQAItem(){
        helper.click(getMyQAItem());
    }

    public void clickMyActivityItem(){
        helper.click(getMyActivityItem());
    }

    public void clickMyTeamItem(){
        helper.click(getMyTeamItem());
    }

    public void clickSettingsIcon(){
        helper.click(getMySettingsIcon());
    }

    public String getNickName(){
       return helper.getTextOfTextView(getNickNameTv());
    }

    public void clickFavorites(){
        helper.click(getFavorites());
    }
}
