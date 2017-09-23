package com.example.aaron.oschina1.pages;

import android.support.test.uiautomator.UiObject2;

import com.example.aaron.oschina1.common.Helper;

/**
 * Created by Aaron on 2017/9/17.
 */

public class PageFavorites {
    private Helper helper;

    public PageFavorites(Helper helper){
        this.helper = helper;
    }

    public UiObject2 getBackBtn(){
        return helper.findByContentDesc("Navigate up");
    }

    public UiObject2 getNewsTitle(int index){
        return helper.findById("net.oschina.app:id/tv_title",index);
    }

    public void clickBackBtn(){
        helper.click(getBackBtn());
    }

    public String getNewsTtileValue(int index){
       return helper.getTextOfTextView(getNewsTitle(index));
    }


}
