package com.ocnyang.soraka.asset.threadpool;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/*******************************************************************
 *    * * * *   * * * *   *     *       Created by OCN.Yang
 *    *     *   *         * *   *       Time:2018/2/28 20:01.
 *    *     *   *         *   * *       Email address:ocnyang@gmail.com
 *    * * * *   * * * *   *     *.Yang  Web site:www.ocnyang.com
 *******************************************************************/

/**
 * ScheduledExecutorService比Timer更安全，功能更强大
 */

public enum ScheduledThreadPool {
    THREAD;

    /**
     * 表示延迟 delay 秒执行
     * @param runnable
     * @param delay
     */
    public void start(Runnable runnable, long delay) {
        ScheduledExecutorService mScheduledExecutorService = Executors.newScheduledThreadPool(1);
        mScheduledExecutorService.schedule(runnable, delay, TimeUnit.SECONDS);
    }

    /**
     * 表示延迟 initialDelay 秒后每 period 秒执行一次
     * @param runnable
     * @param initialDelay
     * @param period
     */
    public void start(Runnable runnable,
                      long initialDelay,
                      long period) {
        ScheduledExecutorService mScheduledExecutorService = Executors.newScheduledThreadPool(1);
        mScheduledExecutorService.scheduleAtFixedRate(runnable, initialDelay,period, TimeUnit.SECONDS);
    }
}
