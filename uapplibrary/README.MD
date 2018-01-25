# UAppLibrary友盟统计

### 集成方式（已集成，直接查看使用方式即可）

    compile 'com.umeng.sdk:common:latest.integration'
    compile 'com.umeng.sdk:analytics:latest.integration'

如果无法正常集成请添加如下配置：

    allprojects {
        repositories {
                mavenCentral()     
        }
    }
    
### 使用方式：
在主项目的 `BaseApplication` 中初始化：`UmengHelper.init()`。  
然后继承相关 Activity/Fragment 或者 自己调用相关方法。

集成文档地址：[http://dev.umeng.com/sdk_integate/android_sdk/android_common_guide](http://dev.umeng.com/sdk_integate/android_sdk/android_common_guide)  
