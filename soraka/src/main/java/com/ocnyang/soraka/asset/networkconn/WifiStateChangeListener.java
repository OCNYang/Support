package com.ocnyang.soraka.asset.networkconn;

import android.content.Context;

/*******************************************************************
 *    * * * *   * * * *   *     *       Created by OCN.Yang
 *    *     *   *         * *   *       Time:2018/3/5 17:04.
 *    *     *   *         *   * *       Email address:ocnyang@gmail.com
 *    * * * *   * * * *   *     *.Yang  Web site:www.ocnyang.com
 *******************************************************************/


public interface WifiStateChangeListener {
    public void onWifiStateChange(Context context, boolean enabled);
}
