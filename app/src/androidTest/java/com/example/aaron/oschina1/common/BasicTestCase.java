package com.example.aaron.oschina1.common;

import android.content.Context;
import android.content.Intent;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.support.test.uiautomator.By;
import android.support.test.uiautomator.UiDevice;
import android.support.test.uiautomator.Until;

import com.example.aaron.oschina1.pages.PageManager;

import org.junit.Before;
import org.junit.runner.RunWith;

/**
 * Created by Aaron on 2017/9/17.
 */
@RunWith(AndroidJUnit4.class)
public class BasicTestCase {

    private UiDevice device;
    private final String PACKAGE_NAME = "net.oschina.app";
    private Helper helper;
    public PageManager pm;

    @Before
    public void setUp() throws Exception {
        // 实例化UiDevice
        device = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation());
        helper = new Helper(device);
        pm = new PageManager(helper);
        // 启动应用
        //获取上下文
        Context context = InstrumentationRegistry.getContext();
        //通过将包名传给包管理器获取启动的intent
        final Intent intent = context.getPackageManager()
                .getLaunchIntentForPackage(PACKAGE_NAME);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
//        //启动应用
        context.startActivity(intent);
//        // 等待应用启动
//        device.wait(Until.hasObject(By.text("动弹")),8000);
    }
}
