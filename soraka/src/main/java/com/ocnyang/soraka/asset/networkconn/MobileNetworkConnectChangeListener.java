package com.ocnyang.soraka.asset.networkconn;

import android.content.Context;

/*******************************************************************
 *    * * * *   * * * *   *     *       Created by OCN.Yang
 *    *     *   *         * *   *       Time:2018/3/5 17:11.
 *    *     *   *         *   * *       Email address:ocnyang@gmail.com
 *    * * * *   * * * *   *     *.Yang  Web site:www.ocnyang.com
 *******************************************************************/


public interface MobileNetworkConnectChangeListener {
    public void onMobileNetworkConnectChange(Context context, boolean isConnect);
}
