# 小米推送

>版本:v3.6.0  

###使用方法：  
1. 在主工程中的配置文件 `AndroidManifest.xml` 中加入自定义的权限，  

        <permission
            android:name="com.ocnyang.qpixel.permission.MIPUSH_RECEIVE"
            android:protectionLevel="signature"/>
        <uses-permission android:name="com.ocnyang.qpixel.permission.MIPUSH_RECEIVE"/>
    
2. 在主项目的入口处（`BaseApplication` 或者 `MainActivity`）调用注册初始化：

        MIPushUser.registerPush(this, getAppID(), getAppKEY());

3. 更多设置通过 `MIPushUser` 工具类;  
消息接收的回调在 `MIPushMessageReceiver` 中，如果自定义接收到消息的其他处理方式，可以在这里添加
(想办法：比如重新继承它或 `PushMessageReceiver` 并重新注册这个广播)。

Android 使用文档地址：[https://dev.mi.com/console/doc/detail?pId=41](https://dev.mi.com/console/doc/detail?pId=41)  
SDK 下载地址：[https://dev.mi.com/mipush/downpage/android.html](https://dev.mi.com/mipush/downpage/android.html)  


