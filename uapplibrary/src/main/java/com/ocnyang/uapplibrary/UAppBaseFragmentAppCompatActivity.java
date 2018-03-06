package com.ocnyang.uapplibrary;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/*******************************************************************
 *    * * * *   * * * *   *     *       Created by OCN.Yang
 *    *     *   *         * *   *       Time:2018/1/25 18:36.
 *    *     *   *         *   * *       Email address:ocnyang@gmail.com
 *    * * * *   * * * *   *     *.Yang  Web site:www.ocnyang.com
 *******************************************************************/


public class UAppBaseFragmentAppCompatActivity extends AppCompatActivity {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        UMengHelper.openActivityDurationTrack();
    }

    @Override
    public void onResume() {
        super.onResume();
        UMengHelper.onResume(this);//统计时长
    }

    @Override
    public void onPause() {
        super.onPause();
        UMengHelper.onPause(this);
    }
}
