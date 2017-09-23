package com.example.aaron.oschina1.testcases.userinfo;

import com.example.aaron.oschina1.common.BasicTestCase;

import junit.framework.Assert;

import org.junit.Test;

/**
 * Created by Aaron on 2017/9/17.
 */

public class ChangeUserName extends BasicTestCase {
    //1. 登录状态
    //2. 点击我的资料，进行用户名修改修工程，ifabelsebc
    //3.退出再登录，校验用户名被修改为ifabelsebc

    @Test
    public void name() throws Exception {
        pm.getPageCommon().goToMyTab();
        pm.getPageMy().clickLoginIcon();
        pm.getPageLogin().login("735723619@qq.com","12345678");
        pm.getPageMy().clickMyDataItem();
        pm.getPageMyData().clickNickNameTv();
        pm.getPageModifyUserInfo().changeUserName("ifabelsebd");
        pm.getPageModifyUserInfo().clickSaveBtn();
        pm.getPageMyData().clickBackBtn();
        pm.getPageMy().clickSettingsIcon();
        pm.getPageSettings().clickLogoutItem();
        pm.getPageSettings().clickBackBtn();
        pm.getPageMy().clickLoginIcon();
        pm.getPageLogin().login("735723619@qq.com","12345678");
        Assert.assertEquals("ifabelsebd",pm.getPageMy().getNickName());
    }
}
