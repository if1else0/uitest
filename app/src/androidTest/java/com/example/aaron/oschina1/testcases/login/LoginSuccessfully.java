package com.example.aaron.oschina1.testcases.login;

import com.example.aaron.oschina1.common.BasicTestCase;

import junit.framework.Assert;

import org.junit.Test;

/**
 * Created by Aaron on 2017/9/17.
 */

public class LoginSuccessfully extends BasicTestCase {

    @Test
    public void name() throws Exception {
        pm.getPageCommon().goToMyTab();
        pm.getPageMy().clickLoginIcon();
//        pm.getPageLogin().enterName("735723619@qq.com");
//        pm.getPageLogin().enterPwd("12345678");
//        pm.getPageLogin().clickLoginBtn();
        pm.getPageLogin().login("735723619@qq.com","12345678");
        //1. 控件的定位
        //2. 控件的操作
        //3. 检验点的编写
        Assert.assertEquals("autotest",pm.getPageMy().getNickName());
    }

}

