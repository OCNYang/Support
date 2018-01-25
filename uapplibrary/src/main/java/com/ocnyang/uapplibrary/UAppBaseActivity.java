package com.ocnyang.uapplibrary;

import android.support.v7.app.AppCompatActivity;

import com.umeng.analytics.MobclickAgent;

/*******************************************************************
 *    * * * *   * * * *   *     *       Created by OCN.Yang
 *    *     *   *         * *   *       Time:2018/1/25 18:33.
 *    *     *   *         *   * *       Email address:ocnyang@gmail.com
 *    * * * *   * * * *   *     *.Yang  Web site:www.ocnyang.com
 *******************************************************************/


public class UAppBaseActivity extends AppCompatActivity {
    @Override
    public void onResume() {
        super.onResume();
        UMengHelper.onResume(this);
    }

    @Override
    public void onPause() {
        super.onPause();
        UMengHelper.onPause(this);
    }
}
