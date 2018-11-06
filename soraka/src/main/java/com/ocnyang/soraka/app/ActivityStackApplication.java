package com.ocnyang.soraka.app;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/*******************************************************************
 *    * * * *   * * * *   *     *       Created by OCN.Yang
 *    *     *   *         * *   *       Time: 2018/7/31 17:21.
 *    *     *   *         *   * *       Email address: ocnyang@gmail.com
 *    * * * *   * * * *   *     *.Yang  Web site: www.ocnyang.com
 *******************************************************************/

public class ActivityStackApplication extends Application {

    protected static Context context;

    /**
     * 维护Activity 的list
     */
    private static List<Activity> mActivitys = Collections.synchronizedList(new LinkedList<Activity>());

    @Override
    public void onCreate() {
        super.onCreate();
        context = this.getApplicationContext();
        registerActivityListener();
    }

    private void registerActivityListener() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.ICE_CREAM_SANDWICH) {
            registerActivityLifecycleCallbacks(new ActivityLifecycleCallbacksImp() {
                @Override
                public void onActivityCreated(Activity activity, Bundle savedInstanceState) {
                    pushActivity(activity);
                }

                @Override
                public void onActivityDestroyed(Activity activity) {
                    if (null == mActivitys || mActivitys.isEmpty()) {
                        return;
                    }
                    if (mActivitys.contains(activity)) {
                        popActivity(activity);
                    }
                }
            });
        }
    }


    public static Context getContext() {
        return context;
    }

    /**
     * 添加一个 activity 到管理里
     * @param activity
     */
    public void pushActivity(Activity activity) {
        mActivitys.add(activity);
    }

    /**
     * 作用说明 ：删除一个 activity 在管理里
     * @param activity
     */
    public void popActivity(Activity activity) {
        mActivitys.remove(activity);
    }

    /**
     * get current Activity 获取当前 Activity（栈中最后一个压入的）
     */
    public static Activity currentActivity() {
        if (mActivitys == null || mActivitys.isEmpty()) {
            return null;
        }
        return mActivitys.get(mActivitys.size() - 1);
    }

    /**
     * 结束当前 Activity（栈中最后一个压入的）
     */
    public static void finishCurrentActivity() {
        if (mActivitys == null || mActivitys.isEmpty()) {
            return;
        }
        finishActivity(mActivitys.get(mActivitys.size() - 1));
    }

    /**
     * 结束指定的 Activity
     */
    public static void finishActivity(Activity activity) {
        if (mActivitys == null || mActivitys.isEmpty()) {
            return;
        }
        if (activity != null) {
            mActivitys.remove(activity);
            activity.finish();
            activity = null;
        }
    }

    /**
     * 结束指定类名的 Activity
     */
    public static void finishActivity(Class<?> cls) {
        if (mActivitys == null || mActivitys.isEmpty()) {
            return;
        }
        for (Activity activity : mActivitys) {
            if (activity.getClass().equals(cls)) {
                finishActivity(activity);
            }
        }
    }

    /**
     * 按照指定类名找到 activity
     *
     * @param cls
     * @return
     */
    public static Activity findActivity(Class<?> cls) {
        Activity targetActivity = null;
        if (mActivitys != null) {
            for (Activity activity : mActivitys) {
                if (activity.getClass().equals(cls)) {
                    targetActivity = activity;
                    break;
                }
            }
        }
        return targetActivity;
    }

    /**
     * 作用说明 ：获取当前最顶部 activity 的实例
     * @return
     */
    public Activity getTopActivity() {
        Activity mBaseActivity;
        synchronized (mActivitys) {
            final int size = mActivitys.size() - 1;
            if (size < 0) {
                return null;
            }
            mBaseActivity = mActivitys.get(size);
        }
        return mBaseActivity;
    }

    /**
     * @return 作用说明 ：获取当前最顶部的 activity 名字
     */
    public String getTopActivityName() {
        Activity mBaseActivity;
        synchronized (mActivitys) {
            final int size = mActivitys.size() - 1;
            if (size < 0) {
                return null;
            }
            mBaseActivity = mActivitys.get(size);
        }
        return mBaseActivity.getClass().getName();
    }

    /**
     * 结束所有Activity
     */
    public static void finishAllActivity() {
        if (mActivitys == null) {
            return;
        }
        for (Activity activity : mActivitys) {
            activity.finish();
        }
        mActivitys.clear();
    }

    /**
     * 退出应用程序
     */
    public static void appExit() {
        try {
            finishAllActivity();
        } catch (Exception e) {
        }
    }

    public static boolean isAllActivityFinished() {
        return mActivitys == null || mActivitys.isEmpty();
    }
}