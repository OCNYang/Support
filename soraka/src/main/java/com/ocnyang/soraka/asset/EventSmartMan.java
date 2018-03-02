package com.ocnyang.soraka.asset;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/*******************************************************************
 *    * * * *   * * * *   *     *       Created by OCN.Yang
 *    *     *   *         * *   *       Time:2018/3/2 10:36.
 *    *     *   *         *   * *       Email address:ocnyang@gmail.com
 *    * * * *   * * * *   *     *.Yang  Web site:www.ocnyang.com
 *******************************************************************/

/**
 * 防止同一按钮在短时间内被多次点击
 * <p>
 * 1. 不适合列表的item的事件
 * 2. 点击后页面跳转的页面没必要使用（不会产生短时多点的事件）
 * 3. 事件处理逻辑只有Toast的，请使用防止Toast重复显示的库
 */

public enum EventSmartMan {
    CLICK;

    public static final int DEF_SAFE_TIME = 2;
    private int mViewID;
    private int runFlag = 0;
    private ScheduledExecutorService scheduledThreadPool;

    public boolean start(int viewID) {
        return this.start(viewID, DEF_SAFE_TIME);
    }

    /**
     * 验证事件是否在短时间内多次触发
     * @param viewID 事件唯一的标示，建议使用事件体 View 的ID
     * @param safeTime_seconds 设置仿多次触发的安全时间（即间隔时间），单位为：秒
     * @return
     */
    public boolean start(int viewID, int safeTime_seconds) {
        boolean isFirst = true;

        if ((mViewID == 0) || (mViewID != viewID)) {
            mViewID = viewID;
            isFirst = true;
            startThread(safeTime_seconds);
        } else if (mViewID == viewID) {
            if (runFlag == 1) {
                isFirst = false;
            } else if (runFlag == 2) {
                isFirst = true;
                startThread(safeTime_seconds);
            }
        }
        return isFirst;
    }

    private void startThread(int safeTime) {
        runFlag = 1;
        if (scheduledThreadPool == null) {
            scheduledThreadPool = Executors.newScheduledThreadPool(5);
        }
        scheduledThreadPool.schedule(new Runnable() {
            @Override
            public void run() {
                runFlag = 2;
            }
        }, safeTime, TimeUnit.SECONDS);
    }
}
