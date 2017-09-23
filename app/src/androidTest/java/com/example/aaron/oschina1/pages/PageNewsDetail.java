package com.example.aaron.oschina1.pages;

import android.support.test.uiautomator.UiObject2;

import com.example.aaron.oschina1.common.Helper;

/**
 * Created by Aaron on 2017/9/17.
 */

public class PageNewsDetail {
    private Helper helper;

    public PageNewsDetail(Helper helper){
        this.helper = helper;
    }

    public UiObject2 getBackBtn(){
        return helper.findByContentDesc("Navigate up");
    }

    public UiObject2 getNewsTitle(){
        return helper.findById("net.oschina.app:id/tv_title");
    }

    public UiObject2 getAddToFavoritesBtn(){
        return helper.findById("net.oschina.app:id/ib_fav");
    }

    public UiObject2 getShareBtn(){
        return  helper.findById("net.oschina.app:id/ib_share");
    }

    public UiObject2 getWechatMoment(){
        return helper.findByText("朋友圈");
    }

    public void clickBackBtn(){
        helper.click(getBackBtn());
    }

    public void clickAddToFavoritesBtn(){
        helper.click(getAddToFavoritesBtn());
    }

    public void clickShareBtn(){
        helper.click(getShareBtn());
    }

    public String getNewsTitleValue(){
       return helper.getTextOfTextView(getNewsTitle());
    }


    public void shareToWechatMoment(){
        helper.click(getWechatMoment());
    }

}
