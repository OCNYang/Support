package com.ocnyang.pushlibrary;

import android.content.Context;

import com.xiaomi.mipush.sdk.MiPushCommandMessage;
import com.xiaomi.mipush.sdk.MiPushMessage;

/*******************************************************************
 *    * * * *   * * * *   *     *       Created by OCN.Yang
 *    *     *   *         * *   *       Time:2018/1/26 09:16.
 *    *     *   *         *   * *       Email address:ocnyang@gmail.com
 *    * * * *   * * * *   *     *.Yang  Web site:www.ocnyang.com
 *******************************************************************/


public interface IPushOnReceiveListener {
    void onReceivePassThroughMessage(Context context, MiPushMessage message);
    void onNotificationMessageClicked(Context context, MiPushMessage message);
    void onNotificationMessageArrived(Context context, MiPushMessage message);
    void onCommandResult(Context context, MiPushCommandMessage message);
    void onReceiveRegisterResult(Context context, MiPushCommandMessage message);
}
