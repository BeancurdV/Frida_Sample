package com.beancurdv.frida.sample;

/**
 * 静态常量、静态方法
 *
 * @author beancurdv on 2024/4/9
 */
public class Constants {
    public static String URL = "https://www.baidu.com";

    private static String mAppVersion = "1.0.0";

    public static String getAppVersion() {
        return mAppVersion;
    }
}
