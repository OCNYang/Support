# Support

### 相关说明
**[总说明文档](https://github.com/OCNYang/Support/blob/master/soraka/README.MD)**  

**[Push Library 说明文档（小米推送）](https://github.com/OCNYang/Support/blob/master/pushlibrary/README.MD)**  

**[UApp Library 说明文档（友盟统计）](https://github.com/OCNYang/Support/blob/master/uapplibrary/README.MD)**

### 使用方法

**Step 1.** Add the token to $HOME/.gradle/gradle.properties  

    authToken=jp_a1f20fodr074h4tp9nksut8nk4

**Step 2.** Then use authToken as the username in your build.gradle  

    repositories {
        maven {
            url "https://jitpack.io"
            credentials { username authToken }
        }
    }
    
**Step 3.** add you need  

    compile 'com.github.OCNYang.Support:pushlibrary:1.0'
    compile 'com.github.OCNYang.Support:soraka:1.0'
    compile 'com.github.OCNYang.Support:uapplibrary:1.0'