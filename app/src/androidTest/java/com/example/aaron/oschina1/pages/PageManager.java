package com.example.aaron.oschina1.pages;

import com.example.aaron.oschina1.common.Helper;

/**
 * Created by Aaron on 2017/9/17.
 */

/**
 * 每新增一个Page类都需要到PageManager这个管理类里面添加获取这个Page类的get方法
 */
public class PageManager {
    private Helper helper;
    private PageCommon pageCommon;
    private PageMy pageMy;
    private PageLogin pageLogin;
    private PageMyData pageMyData;
    private PageModifyUserInfo pageModifyUserInfo;
    private PageSettings pageSettings;
    private PageAbout pageAbout;
    private PageHome pageHome;
    private PageNewsDetail pageNewsDetail;
    private PageFavorites pageFavorites;
    private PageWeChatMoment pageWeChatMoment;

    public PageManager(Helper helper){
        this.helper = helper;
    }

    public PageCommon getPageCommon(){
        if(pageCommon == null){
            pageCommon = new PageCommon(helper);
        }
        return pageCommon;
    }

    public PageMy getPageMy(){
        if(pageMy == null){
            pageMy = new PageMy(helper);
        }
        return pageMy;
    }

    public PageLogin getPageLogin(){
        if(pageLogin == null){
            pageLogin = new PageLogin(helper);
        }
        return pageLogin;
    }

    public PageMyData getPageMyData(){
        if(pageMyData == null){
            pageMyData = new PageMyData(helper);
        }
        return pageMyData;
    }

    public PageModifyUserInfo getPageModifyUserInfo(){
        if(pageModifyUserInfo == null){
            pageModifyUserInfo = new PageModifyUserInfo(helper);
        }
        return pageModifyUserInfo;
    }

    public PageSettings getPageSettings(){
        if(pageSettings == null){
            pageSettings = new PageSettings(helper);
        }
        return pageSettings;
    }
    public PageAbout getPageAbout(){
        if(pageAbout == null){
            pageAbout = new PageAbout(helper);
        }
        return pageAbout;
    }

    public PageHome getPageHome(){
        if(pageHome == null){
            pageHome = new PageHome(helper);
        }
        return pageHome;
    }

    public PageNewsDetail getPageNewsDetail(){
        if(pageNewsDetail == null){
            pageNewsDetail = new PageNewsDetail(helper);
        }
        return pageNewsDetail;
    }

    public PageFavorites getPageFavorites(){
        if(pageFavorites == null){
            pageFavorites = new PageFavorites(helper);
        }
        return pageFavorites;
    }

    public PageWeChatMoment getPageWeChatMoment(){
        if(pageWeChatMoment == null){
            pageWeChatMoment = new PageWeChatMoment(helper);
        }
        return pageWeChatMoment;
    }
}
