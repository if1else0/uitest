package com.example.aaron.oschina1.pages;

import android.provider.Contacts;
import android.support.test.uiautomator.UiObject2;

import com.example.aaron.oschina1.common.Helper;

/**
 * Created by Aaron on 2017/9/17.
 */

public class PageLogin {
    private Helper helper;

    public PageLogin(Helper helper){
        this.helper = helper;
    }

    public UiObject2 getBackIcon(){
        return helper.findById("net.oschina.app:id/ib_navigation_back");
    }

    public UiObject2 getNameET(){
        return helper.findById("net.oschina.app:id/et_login_username");
    }

    public UiObject2 getPwdET(){
        return helper.findById("net.oschina.app:id/et_login_pwd");
    }

    public UiObject2 getLoginIcon(){
        return helper.findById("net.oschina.app:id/bt_login_submit");
    }

    public UiObject2 getForgetPwdTv(){
        return helper.findById("net.oschina.app:id/tv_login_forget_pwd");
    }

    public UiObject2 getRegisterBtn(){
        return helper.findById("net.oschina.app:id/bt_login_register");
    }

    /**
     * 下拉选择其他登录方式的按钮
     * @return
     */
    public UiObject2 getPullBtn(){
        return helper.findById("net.oschina.app:id/ll_login_pull");
    }

    public void clickBackBtn(){
        helper.click(getBackIcon());
    }

    public void enterName(String name){
        helper.enterText(getNameET(),name);
    }

   public void enterPwd(String pwd){
       helper.enterText(getPwdET(),pwd);
   }

   public void clickLoginBtn(){
       helper.click(getLoginIcon());
   }

   public void clickForgetPwdTv(){
       helper.click(getForgetPwdTv());
   }

   public void clickRegisterBtn(){
       helper.click(getRegisterBtn());
   }

   public void clickPullBtn(){
       helper.click(getPullBtn());
   }

    public void clearName(){
        helper.clearEditText(getNameET());
    }

    public void clearPwd(){
        helper.clearEditText(getPwdET());
    }

    public void login(String name,String pwd){
        clearName();
        enterName(name);
        clearPwd();
        enterPwd(pwd);
        clickLoginBtn();
    }

    public boolean isRegisterBtnShown(){
        if(getRegisterBtn() != null){
            return true;
        }
        return false;
    }
}
