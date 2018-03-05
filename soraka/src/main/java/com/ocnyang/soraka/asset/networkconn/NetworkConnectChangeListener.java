package com.ocnyang.soraka.asset.networkconn;

import android.content.Context;

/*******************************************************************
 *    * * * *   * * * *   *     *       Created by OCN.Yang
 *    *     *   *         * *   *       Time:2018/3/5 17:13.
 *    *     *   *         *   * *       Email address:ocnyang@gmail.com
 *    * * * *   * * * *   *     *.Yang  Web site:www.ocnyang.com
 *******************************************************************/


public interface NetworkConnectChangeListener {
    public void onNetworkConnectChange(Context context, boolean isConnect);
}
