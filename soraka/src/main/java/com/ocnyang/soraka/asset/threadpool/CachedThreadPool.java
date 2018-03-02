package com.ocnyang.soraka.asset.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*******************************************************************
 *    * * * *   * * * *   *     *       Created by OCN.Yang
 *    *     *   *         * *   *       Time:2018/2/28 19:46.
 *    *     *   *         *   * *       Email address:ocnyang@gmail.com
 *    * * * *   * * * *   *     *.Yang  Web site:www.ocnyang.com
 *******************************************************************/

/**
 * 创建一个可缓存线程池，如果线程池长度超过处理需要，可灵活回收空闲线程，若无可回收,则新建线程。
 * 线程池为无限大，当执行第二个任务时第一个任务已经完成，会复用执行第一个任务的线程，而不用每次新建线程。
 */

public enum CachedThreadPool {
    THREAD;
    private ExecutorService mExecutorService;

    public void start(Runnable runnable){
        if (mExecutorService == null) {
            mExecutorService = Executors.newCachedThreadPool();
        }
        mExecutorService.execute(runnable);
    }
}
