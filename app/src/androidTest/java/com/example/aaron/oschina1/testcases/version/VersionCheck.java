package com.example.aaron.oschina1.testcases.version;

import com.example.aaron.oschina1.common.BasicTestCase;

import junit.framework.Assert;

import org.junit.Test;

/**
 * Created by Aaron on 2017/9/17.
 */

public class VersionCheck extends BasicTestCase {

    @Test
    public void name() throws Exception {
        pm.getPageCommon().goToMyTab();
        pm.getPageMy().clickSettingsIcon();
        pm.getPageSettings().clickAboutItem();
        String actualVersion = pm.getPageAbout().getCurrentVersion();
        String expextedVersion = "v2.8.8";
        Assert.assertTrue(actualVersion.startsWith(expextedVersion));
    }
}
