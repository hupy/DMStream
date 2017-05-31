直接项目
    采用MVP模式，使用Retorfit2.0+RxJava1.0+OKhttp+Fresco+Rtmp直播


三方库说明
    //     适配
    compile 'com.zhy:autolayout:1.4.5'
    //黄油刀
    compile 'com.jakewharton:butterknife:8.1.0'
    apt 'com.jakewharton:butterknife-compiler:8.1.0'
    //提示框，消息框等
    compile 'com.github.GaoYin2016:Android-SVProgressHUD:1.0'
    //    侧滑返回
    compile 'me.imid.swipebacklayout.lib:library:1.0.0'
    //RxJava and RxAndroid
    compile 'io.reactivex:rxjava:1.1.8'
    compile 'io.reactivex:rxandroid:1.2.1'
    // permissions
    compile 'com.tbruyelle.rxpermissions:rxpermissions:0.9.0@aar'
    //RxLifecycle 内存泄露
    compile 'com.trello:rxlifecycle:0.6.1'
    compile 'com.trello:rxlifecycle-components:0.6.1'
    compile 'com.android.support:appcompat-v7:25.0.1'
    compile 'com.android.support:recyclerview-v7:25.0.1'
    //    网络依赖库日志打印
    compile 'com.squareup.okhttp3:logging-interceptor:3.3.1'
    //Retrofit2
    compile 'com.squareup.retrofit2:retrofit:2.1.0'
    compile 'com.squareup.retrofit2:adapter-rxjava:2.1.0'
    compile 'com.squareup.retrofit2:converter-gson:2.1.0'
    // log管理
    compile 'com.orhanobut:logger:1.15'
    compile files('libs/tbs_sdk_thirdapp_v2.5.0.1031_36880_sharewithdownload_obfs_20161107_154437.jar')
    //-------图片框架------
    compile 'com.facebook.fresco:fresco:0.12.0'
    compile 'com.facebook.fresco:imagepipeline-okhttp3:0.12.0'
    // 在 API < 14 上的机器支持 WebP 时，需要添加
    compile 'com.facebook.fresco:animated-base-support:0.12.0'

    // 支持 GIF 动图，需要添加
    compile 'com.facebook.fresco:animated-gif:0.12.0'
    // 支持 WebP （静态图+动图），需要添加
    compile 'com.facebook.fresco:animated-webp:0.12.0'
    compile 'com.facebook.fresco:webpsupport:0.12.0'
    // 仅支持 WebP 静态图，需要添加
    compile 'com.facebook.fresco:webpsupport:0.12.0'
    compile files('libs/tbs_sdk_thirdapp_v2.5.0.1037_36880_minsize_obfs_20161110_102536.jar')
    //TabLayout
    compile 'com.flyco.tablayout:FlycoTabLayout_Lib:2.1.0@aar'
//    轮播图
    compile 'cn.bingoogolapple:bga-banner:2.1.5@aar'
    compile 'com.android.support:support-v4:25.0.1'
//    eventbus
    compile 'org.greenrobot:eventbus:3.0.0'
//    视频播放器
    compile project(path: ':InitActivity')
////    adapter
    compile 'com.github.CymChad:BaseRecyclerViewAdapterHelper:2.7.7'
//    弹幕
    compile 'com.github.ctiao:DanmakuFlameMaster:0.4.6'

  


参考资料

    弹幕三方库：[DanMu](https://github.com/Bilibili/DanmakuFlameMaster)

    轮播图：[BGABanner](https://github.com/bingoogolapple/BGABanner-Android)

    刷新加载控件[XRefreshView](https://github.com/huxq17/XRefreshView)

    导航栏控件 [FlyCoTabLayout](https://github.com/H07000223/FlycoTabLayout)

    弹幕与房间加密参考项目：[斗鱼项目](https://github.com/littleMeng/video-live)

    直播视频播放器 ：[vitamio播放器](https://github.com/yixia/VitamioBundle) (备注:直播视频格式：HLS,RTMP）

 
