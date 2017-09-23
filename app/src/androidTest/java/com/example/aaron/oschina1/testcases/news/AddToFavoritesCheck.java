package com.example.aaron.oschina1.testcases.news;

import com.example.aaron.oschina1.common.BasicTestCase;

import junit.framework.Assert;

import org.junit.Test;

/**
 * Created by Aaron on 2017/9/17.
 */

public class AddToFavoritesCheck extends BasicTestCase{

    @Test
    public void name() throws Exception {
        pm.getPageCommon().goToMyTab();
        pm.getPageMy().clickLoginIcon();
        pm.getPageLogin().login("735723619@qq.com","12345678");
        pm.getPageCommon().goToHomeTab();
        pm.getPageHome().clickNewsItem(3);
        pm.getPageNewsDetail().clickAddToFavoritesBtn();
        String newTile = pm.getPageNewsDetail().getNewsTitleValue();
        pm.getPageNewsDetail().clickBackBtn();
        pm.getPageCommon().goToMyTab();
        pm.getPageMy().clickFavorites();
        String actualNewsTitle = pm.getPageFavorites().getNewsTtileValue(1);
        Assert.assertEquals(newTile,actualNewsTitle);
    }
}
