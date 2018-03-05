# 记录日志
### 1. 推送：MIPush
说明：pushlibrary/readme.md  

### 2. Retrofit

    compile 'com.squareup.retrofit2:retrofit:2.3.0'

API 地址：[http://square.github.io/retrofit/](http://square.github.io/retrofit/)  
GitHub 地址：[https://github.com/square/retrofit](https://github.com/square/retrofit)  

### 3. OkHttp

    implementation 'com.squareup.okhttp3:okhttp:3.9.1'

API 地址：[http://square.github.io/okhttp/](http://square.github.io/okhttp/)  
GitHub 地址：[https://github.com/square/okhttp](https://github.com/square/okhttp)  

### 4. RxJava(未引入)

GitHub 地址：[https://github.com/ReactiveX/RxJava](https://github.com/ReactiveX/RxJava)  

### 5. fresco

    implementation 'com.facebook.fresco:fresco:1.8.0'

使用说明地址：[https://www.fresco-cn.org/docs/index.html](https://www.fresco-cn.org/docs/index.html)  
GitHub 地址：[https://github.com/facebook/fresco](https://github.com/facebook/fresco)  

### 6. ButterKnife(未引入)

请在主项目引入，同时在Android studio中添加对应插件配合使用。  
GitHub 地址：[https://github.com/JakeWharton/butterknife](https://github.com/JakeWharton/butterknife)  

### 7. Gson

    compile 'com.google.code.gson:gson:2.8.2'

同时在Android studio中添加对应插件配合使用。  
GitHub 地址：[https://github.com/google/gson](https://github.com/google/gson)  
高级使用说明：[http://ocnyang.com/tags/Gson/](http://ocnyang.com/tags/Gson/)  

### 8. Logger

    compile 'com.orhanobut:logger:2.1.1'

init:  

    Logger.addLogAdapter(new AndroidLogAdapter());

GitHub 地址：[https://github.com/orhanobut/logger](https://github.com/orhanobut/logger)  

### 9. leakcannary(主项目引入)

    debugImplementation 'com.squareup.leakcanary:leakcanary-android:1.5.4'
    releaseImplementation 'com.squareup.leakcanary:leakcanary-android-no-op:1.5.4'

使用方式：在主项目的 `BaseApplication` 中初始化：  

    @Override
    public void onCreate() {
        super.onCreate();
        if (LeakCanary.isInAnalyzerProcess(this)) {
          // This process is dedicated to LeakCanary for heap analysis.
          // You should not init your app in this process.
          return;
        }
        LeakCanary.install(this);
        // Normal app init code...
    }

GitHub 地址：[https://github.com/square/leakcanary](https://github.com/square/leakcanary)  

### 10. PermissionsDispatcher(未引入)

接入方式在 GitHub 中查看，目前已经支持 Kotlin。  
GitHub 地址：[https://github.com/permissions-dispatcher/PermissionsDispatcher](https://github.com/permissions-dispatcher/PermissionsDispatcher)  

### 11. CircleImageView

    compile 'de.hdodenhof:circleimageview:2.2.0'

使用：

    <de.hdodenhof.circleimageview.CircleImageView
        xmlns:app="http://schemas.android.com/apk/res-auto"
        android:id="@+id/profile_image"
        android:layout_width="96dp"
        android:layout_height="96dp"
        android:src="@drawable/profile"
        app:civ_border_width="2dp"
        app:civ_border_color="#FF000000"/>

GitHub 地址：[https://github.com/hdodenhof/CircleImageView](https://github.com/hdodenhof/CircleImageView)  

### 12. AndroidUtilCode

    compile 'com.blankj:utilcode:1.12.0'

init:  

    //init it in the function of onCreate in ur Application
    Utils.init(application);

GitHub 地址：[https://github.com/Blankj/AndroidUtilCode](https://github.com/Blankj/AndroidUtilCode)  
说明文档地址：[https://github.com/Blankj/AndroidUtilCode/blob/master/utilcode/README-CN.md](https://github.com/Blankj/AndroidUtilCode/blob/master/utilcode/README-CN.md)  

### 13. X5内核(未接入)

国内应用可以考虑使用，国外应用不推荐使用。  

sdk下载地址：[https://x5.tencent.com/tbs/sdk.html](https://x5.tencent.com/tbs/sdk.html)  
官方说明地址：[https://x5.tencent.com/tbs/guide/sdkInit.html](https://x5.tencent.com/tbs/guide/sdkInit.html)  
博客说明地址：[http://blog.csdn.net/niubitianping/article/details/70919385](http://blog.csdn.net/niubitianping/article/details/70919385)  

### 14. SMS短信验证(未接入)

mob地址：[http://www.mob.com/downloadDetail/SMS/android](http://www.mob.com/downloadDetail/SMS/android)  

### 15. UAppLibrary友盟统计
查看 upplibrary/readme.md

### 16. SlidingLayout果冻弹跳布局
SlidingLayout(extends FrameLayout) 其实就是一个自定义的布局

XML样式参数：  
background_view 背景 view  
sliding_mode 滑动模式，both为上下可弹跳，top 为顶部弹跳，bottom 为底部弹跳，默认为 both sliding_pointer_mode 手指模式，
one为只识别一个手指，more为支持多指滑动，默认为more top_max 当滑动模式为top时才有效，用于可滑动的最大距离，如"top_max:200dp"，默认为-1（不限制）

常用API：  
* public void setSlidingOffset(float slidingOffset)设置控件的滑动阻力，有效值为0.1F~1.0F，值越小阻力越大，默认为0.5F
* public void setTargetView(View view)设置控件的前景View
* public void setBackgroundView(View view) 设置控件的背景View
* public void setSlidingListener(SlidingListener slidingListener) 给控件设置监听，可以监听滑动情况
* public void setSlidingMode(int mode) 设置滑动模式
* public void setSlidingDistance(int max) 设置最大滑动距离，仅在top模式下有效

### 17. HTML5WebView
封装的WebView。顶部带进度条、监听返回键、网页缓存。  

### 18.BaseRecyclerViewAdapterHelper
提供 Kotlin 的 Demo。

Add it in your root build.gradle at the end of repositories:

    allprojects {
        repositories {
            ...
            maven { url "https://jitpack.io" }
        }
    }

Add the dependency

    dependencies {
            compile 'com.github.CymChad:BaseRecyclerViewAdapterHelper:VERSION_CODE'
    }
    
最新版本号(2.9.34)：[https://github.com/CymChad/BaseRecyclerViewAdapterHelper/releases](https://github.com/CymChad/BaseRecyclerViewAdapterHelper/releases)

GitHub 地址：[https://github.com/CymChad/BaseRecyclerViewAdapterHelper](https://github.com/CymChad/BaseRecyclerViewAdapterHelper)  
说明地址：[https://www.jianshu.com/p/b343fcff51b0](https://www.jianshu.com/p/b343fcff51b0)  

## 19.线程池(两个常用的)

1. CachedTreadPool 可缓存线程池,可灵活回收空闲线程。使用:  

        CachedThreadPool.THREAD.start(runnable);

2. ScheduledThreadPool 延迟执行、延迟循环执行，比Timer更安全，功能更强大。使用：

        ScheduledThreadPool.THREAD.start(runnable,delay);
        //或
        ScheduledThreadPool.THREAD.start(runnable,delay,period);
        
## 20. EventSmartMan

防止同一按钮在短时间内被多次点击,使用：

    EventSmartMan.CLICK.start(viewID, safeTime_seconds);

## 21. NetworkConnectChangedReceiver

网络改变监听广播：  
* 监听手机WIF连接或断开状态的监听；  
* 监听手机WIFI连接是否有效的监听；  
* 监听手机数据连接是否有效的监听；  
* 监听手机是否有网络连接；  

使用：在主项目的BaseApp或MainActivity中注册这个广播；  

    NetworkConnectChangedReceiver mNetworkChangeReceiver;
    mNetworkChangeReceiver = new NetworkConnectChangedReceiver();
    IntentFilter filter = new IntentFilter();
    filter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
    filter.addAction("android.net.wifi.WIFI_STATE_CHANGED");
    filter.addAction("android.net.wifi.STATE_CHANGE");
    registerReceiver(mNetworkChangeListener,filter);

（可选）如果想更改网络变化的处理逻辑，请重写相对应的回调方法。
