package com.ocnyang.pushlibrary;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Process;
import android.util.Log;

import com.xiaomi.channel.commonutils.logger.LoggerInterface;
import com.xiaomi.mipush.sdk.Logger;
import com.xiaomi.mipush.sdk.MiPushClient;

import java.util.List;

/*******************************************************************
 *    * * * *   * * * *   *     *       Created by OCN.Yang
 *    *     *   *         * *   *       Time:2018/1/25 14:51.
 *    *     *   *         *   * *       Email address:ocnyang@gmail.com
 *    * * * *   * * * *   *     *.Yang  Web site:www.ocnyang.com
 *******************************************************************/


public class MIPushUser {

    public static void registerPush(Context context, String APP_ID, String APP_KEY) {
        registerPush(context, APP_ID, APP_KEY, true);
    }

    public static void registerPush(Context context, String APP_ID, String APP_KEY, boolean setLogger) {
        // 注册push服务，注册成功后会向DemoMessageReceiver发送广播
        // 可以从DemoMessageReceiver的onCommandResult方法中MiPushCommandMessage对象参数中获取注册信息
        Context applicationContext = context.getApplicationContext();
        final String TAG = applicationContext.getPackageName();

        //注册
        if (shouldInit(applicationContext)) {
            MiPushClient.registerPush(context, APP_ID, APP_KEY);
        }

        //注册日志
        if (setLogger) {
            LoggerInterface newLogger = new LoggerInterface() {

                @Override
                public void setTag(String tag) {
                    // ignore
                }

                @Override
                public void log(String content, Throwable t) {
                    Log.d(TAG, content, t);
                }

                @Override
                public void log(String content) {
                    Log.d(TAG, content);
                }
            };
            Logger.setLogger(applicationContext, newLogger);
        }
    }

    private static boolean shouldInit(Context context) {
        ActivityManager am = ((ActivityManager) context.getSystemService(Context.ACTIVITY_SERVICE));
        List<ActivityManager.RunningAppProcessInfo> processInfos = am.getRunningAppProcesses();
        String mainProcessName = context.getPackageName();
        int myPid = Process.myPid();
        for (ActivityManager.RunningAppProcessInfo info : processInfos) {
            if (info.pid == myPid && mainProcessName.equals(info.processName)) {
                return true;
            }
        }
        return false;
    }

    public static void setAlias(Context context, String aliasStr) {
        MiPushClient.setAlias(context, aliasStr, null);
    }

    public static void unsetAlias(Context context, String aliasStr) {
        MiPushClient.unsetAlias(context, aliasStr, null);
    }

    public static void setUserAccount(Context context, String accountStr) {
        MiPushClient.setUserAccount(context, accountStr, null);
    }

    public static void unsetUserAccount(Context context, String accountStr) {
        MiPushClient.unsetUserAccount(context, accountStr, null);
    }

    // 设置标签
    public static void subscribe(Context context, String topicStr) {
        MiPushClient.subscribe(context, topicStr, null);
    }

    // 撤销标签
    public static void unsubscribe(Context context, String topicStr) {
        MiPushClient.unsubscribe(context, topicStr, null);
    }

    // 设置接收消息时间
    public static void setAcceptTime(final Context context) {
        new TimeIntervalDialog(context, new TimeIntervalDialog.TimeIntervalInterface() {

            @Override
            public void apply(int startHour, int startMin, int endHour, int endMin) {
                MiPushClient.setAcceptTime(context, startHour, startMin, endHour, endMin, null);
            }

            @Override
            public void cancel() {
                //ignore
            }

        }).show();
    }

    // 暂停推送
    public static void pausePush(Context context) {
        MiPushClient.pausePush(context, null);
    }

    public static void resumePush(Context context) {
        MiPushClient.resumePush(context, null);
    }
}

