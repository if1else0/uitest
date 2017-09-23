package com.example.aaron.oschina1.testcases.mysettings;

import com.example.aaron.oschina1.common.BasicTestCase;

import junit.framework.Assert;

import org.junit.Test;

/**
 * Created by Aaron on 2017/9/17.
 */

public class LoginStatusCheck extends BasicTestCase {

    @Test
    public void name() throws Exception {
        pm.getPageCommon().goToMyTab();
        pm.getPageMy().clickMyMsgItem();
        Assert.assertTrue(pm.getPageLogin().isRegisterBtnShown());
        pm.getPageLogin().clickBackBtn();

        pm.getPageMy().clickMyDataItem();
        Assert.assertTrue(pm.getPageLogin().isRegisterBtnShown());
        pm.getPageLogin().clickBackBtn();


        pm.getPageMy().clickMyBlogItem();
        Assert.assertTrue(pm.getPageLogin().isRegisterBtnShown());
        pm.getPageLogin().clickBackBtn();

        pm.getPageMy().clickMyQAItem();
        Assert.assertTrue(pm.getPageLogin().isRegisterBtnShown());
        pm.getPageLogin().clickBackBtn();

        pm.getPageMy().clickMyActivityItem();
        Assert.assertTrue(pm.getPageLogin().isRegisterBtnShown());
        pm.getPageLogin().clickBackBtn();

        pm.getPageMy().clickMyTeamItem();
        Assert.assertTrue(pm.getPageLogin().isRegisterBtnShown());
    }
}
