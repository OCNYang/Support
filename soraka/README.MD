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

### 9. leakcannary

    debugCompile 'com.squareup.leakcanary:leakcanary-android:1.5.4'
    releaseCompile 'com.squareup.leakcanary:leakcanary-android-no-op:1.5.4'

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