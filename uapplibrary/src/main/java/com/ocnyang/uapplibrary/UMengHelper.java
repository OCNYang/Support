package com.ocnyang.uapplibrary;

import android.content.Context;

import com.umeng.analytics.MobclickAgent;
import com.umeng.commonsdk.UMConfigure;

import java.util.HashMap;

/*******************************************************************
 *    * * * *   * * * *   *     *       Created by OCN.Yang
 *    *     *   *         * *   *       Time:2018/1/25 18:04.
 *    *     *   *         *   * *       Email address:ocnyang@gmail.com
 *    * * * *   * * * *   *     *.Yang  Web site:www.ocnyang.com
 *******************************************************************/


public class UMengHelper {
    //init------------------------------------------------------------------------------------------
    public static void init(Context context, String appKey, String channel,
                            int deviceType, String pushSecret) {
        UMConfigure.init(context, appKey, channel, deviceType, pushSecret);
    }

    public static void setSecret(Context context, String secretKey) {
        MobclickAgent.setSecret(context, secretKey);
    }

    //Activity--------------------------------------------------------------------------------------
    public static void onResume(Context context) {
        MobclickAgent.onResume(context);
    }

    public static void onPause(Context context) {
        MobclickAgent.onPause(context);
    }

    public static void onKillProcess(Context context) {
        MobclickAgent.onKillProcess(context);
    }

    //User------------------------------------------------------------------------------------------
    public static void onProfileSignIn(String ID) {
        MobclickAgent.onProfileSignIn(ID);
    }

    public static void onProfileSignIn(String Provider, String ID) {
        MobclickAgent.onProfileSignIn(Provider, ID);
    }

    public static void onProfileSignOff() {
        MobclickAgent.onProfileSignOff();
    }

    //Fragment & FragmentActivity-------------------------------------------------------------------
    public static void openActivityDurationTrack(boolean b) {
        MobclickAgent.openActivityDurationTrack(b);
    }

    public static void openActivityDurationTrack() {
        MobclickAgent.openActivityDurationTrack(false);
    }

    public static void onPageStart(String pageName) {
        MobclickAgent.onPageStart(pageName);
    }

    public static void onPageEnd(String pageName) {
        MobclickAgent.onPageEnd(pageName);
    }

    //错误统计 自己调用上传------------------------------------------------------------------------------------------
    public static void setCatchUncaughtExceptions(boolean b) {
        MobclickAgent.setCatchUncaughtExceptions(b);//当b为false时表示关闭错误上传
    }

    public static void reportError(Context context, String error) {
        MobclickAgent.reportError(context, error);//上传自己捕获的异常
    }

    public static void reportError(Context context, Throwable e) {
        MobclickAgent.reportError(context, e);
    }

    //自定义事件上传------------------------------------------------------------------------------------------
    public static void onEvent(Context context, String eventId) {//eventId为当前统计的事件ID
        MobclickAgent.onEvent(context, eventId);//统计发生的次数
    }

    public static void onEvent(Context context, String eventId, HashMap map) {//eventId为当前统计的事件ID
        MobclickAgent.onEvent(context, eventId, map);
    }

}
