# LogUtils
# 看到一个很有意思的日志工具，做成工具自己使用
## 在gradle中依赖：
```
allprojects {
    repositories {
        jcenter()
        maven { url "https://jitpack.io" }
    }
}

compile 'com.github.magiclonw:LogUtils:1.0.0'
```

## 在application中初始化:
 ` Log.init(TAG,true);` OR ` Log.init(TAG,false);`
## 在各方法中调用：
```
        Log.d(json);
        
        Log.e(json);
        
        Log.w(json);
        
        Log.d(text);
        
        Log.e(text);
        
        Log.w(text)
 ```
