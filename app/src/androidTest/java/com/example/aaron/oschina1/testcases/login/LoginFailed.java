package com.example.aaron.oschina1.testcases.login;

import com.example.aaron.oschina1.common.BasicTestCase;

import junit.framework.Assert;

import org.junit.Test;

/**
 * Created by Aaron on 2017/9/17.
 */

public class LoginFailed extends BasicTestCase {

    @Test
    public void name() throws Exception {
        pm.getPageCommon().goToMyTab();
        pm.getPageMy().clickLoginIcon();
        pm.getPageLogin().login("735723619@qq.com","87654321");
        Assert.assertTrue(pm.getPageLogin().isRegisterBtnShown());
    }
}
