package com.example.aaron.oschina1.pages;

import android.support.test.uiautomator.UiObject2;

import com.example.aaron.oschina1.common.Helper;

/**
 * Created by Aaron on 2017/9/17.
 */

public class PageModifyUserInfo {
    private Helper helper;

    public PageModifyUserInfo(Helper helper){
        this.helper = helper;
    }

    public UiObject2 getUserNameEditText(){
       return helper.findById("net.oschina.app:id/et_data");
    }

    public UiObject2 getSaveBtn(){
        return helper.findById("net.oschina.app:id/menu_commit");
    }

    public void changeUserName(String name){
        helper.clearEditText(getUserNameEditText());
        helper.enterText(getUserNameEditText(),name);
    }

    public void clickSaveBtn(){
        helper.click(getSaveBtn());
    }

}
