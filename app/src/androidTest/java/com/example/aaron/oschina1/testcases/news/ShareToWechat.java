package com.example.aaron.oschina1.testcases.news;

import com.example.aaron.oschina1.common.BasicTestCase;

import org.junit.Test;

/**
 * Created by Aaron on 2017/9/17.
 */

public class ShareToWechat extends BasicTestCase {

    @Test
    public void name() throws Exception {
        pm.getPageCommon().goToMyTab();
        pm.getPageMy().clickLoginIcon();
        pm.getPageLogin().login("735723619@qq.com","12345678");
        pm.getPageCommon().goToHomeTab();
        pm.getPageHome().clickNewsItem(3);
        pm.getPageNewsDetail().clickShareBtn();
        pm.getPageNewsDetail().shareToWechatMoment();
        pm.getPageWeChatMoment().setMomentContent("分享来自开源中国的信息");
    }
}
