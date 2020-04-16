package com.wangdong.rxjavaretrofitdaggermvp.bean;

import java.util.List;

/**
 * @author wangdong
 * @descripiton
 * @date 2020/4/13 22:48
 */
public class VideoCategory {

    @Override
    public String toString() {
        return "VideoCategory{" +
                "data=" + data +
                ", errorCode=" + errorCode +
                ", errorMsg='" + errorMsg + '\'' +
                '}';
    }

    /**
     * data : {"curPage":2,"datas":[{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":510,"chapterName":"大厂分享","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":12816,"link":"https://juejin.im/post/5e9059bf6fb9a03c621679cf","niceDate":"1天前","niceShareDate":"2天前","origin":"","prefix":"","projectLink":"","publishTime":1586694643000,"selfVisible":0,"shareDate":1586654067000,"shareUser":"goweii","superChapterId":510,"superChapterName":"大厂对外分享","tags":[],"title":"Gradle 与 Android 构建入门","type":0,"userId":20382,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"madreain","canEdit":false,"chapterId":358,"chapterName":"项目基础功能","collect":false,"courseId":13,"desc":"AACHulk是以Google的ViewModel+DataBinding+LiveData+Lifecycles框架为基础， 结合Okhttp+Retrofit+BaseRecyclerViewAdapterHelper+SmartRefreshLayout+ARouter打造的一款快速开发框架","descMd":"","envelopePic":"https://www.wanandroid.com/resources/image/pc/default_project_img.jpg","fresh":false,"id":12822,"link":"https://www.wanandroid.com/blog/show/2728","niceDate":"1天前","niceShareDate":"1天前","origin":"","prefix":"","projectLink":"https://github.com/madreain/AACHulk","publishTime":1586694400000,"selfVisible":0,"shareDate":1586694400000,"shareUser":"","superChapterId":294,"superChapterName":"开源项目主Tab","tags":[{"name":"项目","url":"/project/list/1?cid=358"}],"title":"最新的kt+jetpack+Coroutine打造的Android开发框架","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"鸿洋","canEdit":false,"chapterId":408,"chapterName":"鸿洋","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":12839,"link":"https://mp.weixin.qq.com/s/UqMe80FCJJpczkuZTix-Hg","niceDate":"2天前","niceShareDate":"1天前","origin":"","prefix":"","projectLink":"","publishTime":1586620800000,"selfVisible":0,"shareDate":1586743944000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/408/1"}],"title":"这交互炸了系列：搞了个酷酷的效果","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":12813,"link":"https://juejin.im/entry/5e76df8a518825490b64a506","niceDate":"2天前","niceShareDate":"2天前","origin":"","prefix":"","projectLink":"","publishTime":1586618307000,"selfVisible":0,"shareDate":1586618307000,"shareUser":"付十一","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"不使用第三方库，Bitmap的优化策略","type":0,"userId":31008,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"鸿洋","canEdit":false,"chapterId":408,"chapterName":"鸿洋","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":12838,"link":"https://mp.weixin.qq.com/s/Zqg9l0C9UgcmAxAqvOtGmQ","niceDate":"2020-04-11 00:00","niceShareDate":"1天前","origin":"","prefix":"","projectLink":"","publishTime":1586534400000,"selfVisible":0,"shareDate":1586743926000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/408/1"}],"title":"Google又更新了：实战 MergeAdapter","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"code小生","canEdit":false,"chapterId":414,"chapterName":"code小生","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":12852,"link":"https://mp.weixin.qq.com/s/E-ETqvQ41UjeYMP91jAeuA","niceDate":"2020-04-10 00:00","niceShareDate":"1天前","origin":"","prefix":"","projectLink":"","publishTime":1586448000000,"selfVisible":0,"shareDate":1586744730000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/414/1"}],"title":"kotlin协程实战：用协程实现动态权限请求","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":12792,"link":"https://juejin.im/post/5e8d87c4f265da47ad218e6b","niceDate":"2020-04-09 08:53","niceShareDate":"2020-04-09 08:53","origin":"","prefix":"","projectLink":"","publishTime":1586393607000,"selfVisible":0,"shareDate":1586393607000,"shareUser":"JsonChao","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"深入探索编译插桩技术（四、ASM 探秘）","type":0,"userId":611,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":229,"chapterName":"AOP","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":12679,"link":"https://juejin.im/post/5e807f606fb9a03c73796cd7","niceDate":"2020-04-09 00:05","niceShareDate":"2020-03-30 08:59","origin":"","prefix":"","projectLink":"","publishTime":1586361947000,"selfVisible":0,"shareDate":1585529940000,"shareUser":"JsonChao","superChapterId":227,"superChapterName":"注解 & 反射 & AOP","tags":[],"title":"深入探索编译插桩技术（一、编译基础）","type":0,"userId":611,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":229,"chapterName":"AOP","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":12717,"link":"https://juejin.im/post/5e84384af265da47e1593102","niceDate":"2020-04-09 00:05","niceShareDate":"2020-04-02 08:42","origin":"","prefix":"","projectLink":"","publishTime":1586361941000,"selfVisible":0,"shareDate":1585788130000,"shareUser":"JsonChao","superChapterId":227,"superChapterName":"注解 & 反射 & AOP","tags":[],"title":"深入探索编译插桩技术（二、AspectJ）","type":0,"userId":611,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":229,"chapterName":"AOP","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":12752,"link":"https://juejin.im/post/5e899721518825739f6b0351","niceDate":"2020-04-09 00:05","niceShareDate":"2020-04-07 08:47","origin":"","prefix":"","projectLink":"","publishTime":1586361933000,"selfVisible":0,"shareDate":1586220427000,"shareUser":"JsonChao","superChapterId":227,"superChapterName":"注解 & 反射 & AOP","tags":[],"title":"深入探索编译插桩技术（三、解密 JVM 字节码）","type":0,"userId":611,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"美团技术团队","canEdit":false,"chapterId":417,"chapterName":"美团技术团队","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":12830,"link":"https://mp.weixin.qq.com/s/wzVc-FngOBbqbMzJjRqajw","niceDate":"2020-04-09 00:00","niceShareDate":"1天前","origin":"","prefix":"","projectLink":"","publishTime":1586361600000,"selfVisible":0,"shareDate":1586743587000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/417/1"}],"title":"Apache Doris在美团外卖数仓中的应用实践","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"鸿洋","canEdit":false,"chapterId":408,"chapterName":"鸿洋","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":12837,"link":"https://mp.weixin.qq.com/s/SkXgevDiQF9T4kyoL4_qVg","niceDate":"2020-04-09 00:00","niceShareDate":"1天前","origin":"","prefix":"","projectLink":"","publishTime":1586361600000,"selfVisible":0,"shareDate":1586743910000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/408/1"}],"title":"那个男人再发力，原来我以前学的 Lambda 都是假的","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":245,"chapterName":"集合相关","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":12778,"link":"https://mp.weixin.qq.com/s?__biz=MzU3Mjc5NjAzMw==&amp;mid=2247484116&amp;idx=1&amp;sn=90221549b6504425ebb86e45a6e411f2&amp;chksm=fcca3f3acbbdb62c93c21ec09ec4387b6cc88c6bd5884ad06476bfffb0cac47b5a406e88cbc7&amp;token=120521760&amp;lang=zh_CN#rd","niceDate":"2020-04-08 23:59","niceShareDate":"2020-04-07 19:06","origin":"","prefix":"","projectLink":"","publishTime":1586361568000,"selfVisible":0,"shareDate":1586257575000,"shareUser":"1240784879@qq.com","superChapterId":245,"superChapterName":"Java深入","tags":[],"title":"Java虚拟机究竟是如何处理SoftReference的","type":0,"userId":57152,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":444,"chapterName":"androidx","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":12783,"link":"https://juejin.im/post/5e8c9e696fb9a03c5c5a88cb","niceDate":"2020-04-08 23:58","niceShareDate":"2020-04-08 08:22","origin":"","prefix":"","projectLink":"","publishTime":1586361514000,"selfVisible":0,"shareDate":1586305339000,"shareUser":"goweii","superChapterId":55,"superChapterName":"5.+高新技术","tags":[],"title":"给 Adapter 做 &ldquo;加法&rdquo; &mdash;&mdash; 实战 MergeAdapter","type":0,"userId":20382,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"xiaoyang","canEdit":false,"chapterId":440,"chapterName":"官方","collect":false,"courseId":13,"desc":"<p>我们一般并不会用到过长的字符串，但是实际上 String 可存储字符串的长度是有约束的，问题来了：<\/p>\r\n<ol>\r\n<li>最长是多少？<\/li>\r\n<li>为什么？<\/li>\r\n<\/ol>\r\n<p>小 tip：注意区分String字面量和String变量。<\/p>","descMd":"","envelopePic":"","fresh":false,"id":12701,"link":"https://www.wanandroid.com/wenda/show/12701","niceDate":"2020-04-08 23:58","niceShareDate":"2020-04-01 00:11","origin":"","prefix":"","projectLink":"","publishTime":1586361497000,"selfVisible":0,"shareDate":1585671069000,"shareUser":"","superChapterId":440,"superChapterName":"问答","tags":[{"name":"本站发布","url":"/article/list/0?cid=440"},{"name":"问答","url":"/wenda"}],"title":"每日一问 | 我们经常用的 String类型，你知道它最大可以放多长的字符串吗？","type":0,"userId":2,"visible":1,"zan":5},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":12785,"link":"https://juejin.im/post/5e8b4b69f265da47f25609ce","niceDate":"2020-04-08 10:19","niceShareDate":"2020-04-08 10:19","origin":"","prefix":"","projectLink":"","publishTime":1586312376000,"selfVisible":0,"shareDate":1586312376000,"shareUser":"Amter","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"Android 你不得不学的HTTP相关知识","type":0,"userId":49976,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"鸿洋","canEdit":false,"chapterId":408,"chapterName":"鸿洋","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":12836,"link":"https://mp.weixin.qq.com/s/MOWdbI5IREjQP1Px-WJY1Q","niceDate":"2020-04-08 00:00","niceShareDate":"1天前","origin":"","prefix":"","projectLink":"","publishTime":1586275200000,"selfVisible":0,"shareDate":1586743892000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/408/1"}],"title":"一个至今仍有很多人写错的技术点！","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"code小生","canEdit":false,"chapterId":414,"chapterName":"code小生","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":12850,"link":"https://mp.weixin.qq.com/s/Zy4xiyHZA4jgbmOlv7fKrA","niceDate":"2020-04-08 00:00","niceShareDate":"1天前","origin":"","prefix":"","projectLink":"","publishTime":1586275200000,"selfVisible":0,"shareDate":1586744698000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/414/1"}],"title":"趁手利器，FSuper","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"code小生","canEdit":false,"chapterId":414,"chapterName":"code小生","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":12851,"link":"https://mp.weixin.qq.com/s/vjXBdLw_L0dW8l5SKnyeGw","niceDate":"2020-04-08 00:00","niceShareDate":"1天前","origin":"","prefix":"","projectLink":"","publishTime":1586275200000,"selfVisible":0,"shareDate":1586744710000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/414/1"}],"title":"Git 如何优雅地回退代码","type":0,"userId":-1,"visible":1,"zan":0}],"offset":20,"over":false,"pageCount":415,"size":20,"total":8286}
     * errorCode : 0
     * errorMsg :
     */

    private DataBean data;
    private int errorCode;
    private String errorMsg;

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public static class DataBean {
        @Override
        public String toString() {
            return "DataBean{" +
                    "curPage=" + curPage +
                    ", offset=" + offset +
                    ", over=" + over +
                    ", pageCount=" + pageCount +
                    ", size=" + size +
                    ", total=" + total +
                    ", datas=" + datas +
                    '}';
        }

        /**
         * curPage : 2
         * datas : [{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":510,"chapterName":"大厂分享","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":12816,"link":"https://juejin.im/post/5e9059bf6fb9a03c621679cf","niceDate":"1天前","niceShareDate":"2天前","origin":"","prefix":"","projectLink":"","publishTime":1586694643000,"selfVisible":0,"shareDate":1586654067000,"shareUser":"goweii","superChapterId":510,"superChapterName":"大厂对外分享","tags":[],"title":"Gradle 与 Android 构建入门","type":0,"userId":20382,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"madreain","canEdit":false,"chapterId":358,"chapterName":"项目基础功能","collect":false,"courseId":13,"desc":"AACHulk是以Google的ViewModel+DataBinding+LiveData+Lifecycles框架为基础， 结合Okhttp+Retrofit+BaseRecyclerViewAdapterHelper+SmartRefreshLayout+ARouter打造的一款快速开发框架","descMd":"","envelopePic":"https://www.wanandroid.com/resources/image/pc/default_project_img.jpg","fresh":false,"id":12822,"link":"https://www.wanandroid.com/blog/show/2728","niceDate":"1天前","niceShareDate":"1天前","origin":"","prefix":"","projectLink":"https://github.com/madreain/AACHulk","publishTime":1586694400000,"selfVisible":0,"shareDate":1586694400000,"shareUser":"","superChapterId":294,"superChapterName":"开源项目主Tab","tags":[{"name":"项目","url":"/project/list/1?cid=358"}],"title":"最新的kt+jetpack+Coroutine打造的Android开发框架","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"鸿洋","canEdit":false,"chapterId":408,"chapterName":"鸿洋","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":12839,"link":"https://mp.weixin.qq.com/s/UqMe80FCJJpczkuZTix-Hg","niceDate":"2天前","niceShareDate":"1天前","origin":"","prefix":"","projectLink":"","publishTime":1586620800000,"selfVisible":0,"shareDate":1586743944000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/408/1"}],"title":"这交互炸了系列：搞了个酷酷的效果","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":12813,"link":"https://juejin.im/entry/5e76df8a518825490b64a506","niceDate":"2天前","niceShareDate":"2天前","origin":"","prefix":"","projectLink":"","publishTime":1586618307000,"selfVisible":0,"shareDate":1586618307000,"shareUser":"付十一","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"不使用第三方库，Bitmap的优化策略","type":0,"userId":31008,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"鸿洋","canEdit":false,"chapterId":408,"chapterName":"鸿洋","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":12838,"link":"https://mp.weixin.qq.com/s/Zqg9l0C9UgcmAxAqvOtGmQ","niceDate":"2020-04-11 00:00","niceShareDate":"1天前","origin":"","prefix":"","projectLink":"","publishTime":1586534400000,"selfVisible":0,"shareDate":1586743926000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/408/1"}],"title":"Google又更新了：实战 MergeAdapter","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"code小生","canEdit":false,"chapterId":414,"chapterName":"code小生","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":12852,"link":"https://mp.weixin.qq.com/s/E-ETqvQ41UjeYMP91jAeuA","niceDate":"2020-04-10 00:00","niceShareDate":"1天前","origin":"","prefix":"","projectLink":"","publishTime":1586448000000,"selfVisible":0,"shareDate":1586744730000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/414/1"}],"title":"kotlin协程实战：用协程实现动态权限请求","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":12792,"link":"https://juejin.im/post/5e8d87c4f265da47ad218e6b","niceDate":"2020-04-09 08:53","niceShareDate":"2020-04-09 08:53","origin":"","prefix":"","projectLink":"","publishTime":1586393607000,"selfVisible":0,"shareDate":1586393607000,"shareUser":"JsonChao","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"深入探索编译插桩技术（四、ASM 探秘）","type":0,"userId":611,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":229,"chapterName":"AOP","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":12679,"link":"https://juejin.im/post/5e807f606fb9a03c73796cd7","niceDate":"2020-04-09 00:05","niceShareDate":"2020-03-30 08:59","origin":"","prefix":"","projectLink":"","publishTime":1586361947000,"selfVisible":0,"shareDate":1585529940000,"shareUser":"JsonChao","superChapterId":227,"superChapterName":"注解 & 反射 & AOP","tags":[],"title":"深入探索编译插桩技术（一、编译基础）","type":0,"userId":611,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":229,"chapterName":"AOP","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":12717,"link":"https://juejin.im/post/5e84384af265da47e1593102","niceDate":"2020-04-09 00:05","niceShareDate":"2020-04-02 08:42","origin":"","prefix":"","projectLink":"","publishTime":1586361941000,"selfVisible":0,"shareDate":1585788130000,"shareUser":"JsonChao","superChapterId":227,"superChapterName":"注解 & 反射 & AOP","tags":[],"title":"深入探索编译插桩技术（二、AspectJ）","type":0,"userId":611,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":229,"chapterName":"AOP","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":12752,"link":"https://juejin.im/post/5e899721518825739f6b0351","niceDate":"2020-04-09 00:05","niceShareDate":"2020-04-07 08:47","origin":"","prefix":"","projectLink":"","publishTime":1586361933000,"selfVisible":0,"shareDate":1586220427000,"shareUser":"JsonChao","superChapterId":227,"superChapterName":"注解 & 反射 & AOP","tags":[],"title":"深入探索编译插桩技术（三、解密 JVM 字节码）","type":0,"userId":611,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"美团技术团队","canEdit":false,"chapterId":417,"chapterName":"美团技术团队","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":12830,"link":"https://mp.weixin.qq.com/s/wzVc-FngOBbqbMzJjRqajw","niceDate":"2020-04-09 00:00","niceShareDate":"1天前","origin":"","prefix":"","projectLink":"","publishTime":1586361600000,"selfVisible":0,"shareDate":1586743587000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/417/1"}],"title":"Apache Doris在美团外卖数仓中的应用实践","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"鸿洋","canEdit":false,"chapterId":408,"chapterName":"鸿洋","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":12837,"link":"https://mp.weixin.qq.com/s/SkXgevDiQF9T4kyoL4_qVg","niceDate":"2020-04-09 00:00","niceShareDate":"1天前","origin":"","prefix":"","projectLink":"","publishTime":1586361600000,"selfVisible":0,"shareDate":1586743910000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/408/1"}],"title":"那个男人再发力，原来我以前学的 Lambda 都是假的","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":245,"chapterName":"集合相关","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":12778,"link":"https://mp.weixin.qq.com/s?__biz=MzU3Mjc5NjAzMw==&amp;mid=2247484116&amp;idx=1&amp;sn=90221549b6504425ebb86e45a6e411f2&amp;chksm=fcca3f3acbbdb62c93c21ec09ec4387b6cc88c6bd5884ad06476bfffb0cac47b5a406e88cbc7&amp;token=120521760&amp;lang=zh_CN#rd","niceDate":"2020-04-08 23:59","niceShareDate":"2020-04-07 19:06","origin":"","prefix":"","projectLink":"","publishTime":1586361568000,"selfVisible":0,"shareDate":1586257575000,"shareUser":"1240784879@qq.com","superChapterId":245,"superChapterName":"Java深入","tags":[],"title":"Java虚拟机究竟是如何处理SoftReference的","type":0,"userId":57152,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":444,"chapterName":"androidx","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":12783,"link":"https://juejin.im/post/5e8c9e696fb9a03c5c5a88cb","niceDate":"2020-04-08 23:58","niceShareDate":"2020-04-08 08:22","origin":"","prefix":"","projectLink":"","publishTime":1586361514000,"selfVisible":0,"shareDate":1586305339000,"shareUser":"goweii","superChapterId":55,"superChapterName":"5.+高新技术","tags":[],"title":"给 Adapter 做 &ldquo;加法&rdquo; &mdash;&mdash; 实战 MergeAdapter","type":0,"userId":20382,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"xiaoyang","canEdit":false,"chapterId":440,"chapterName":"官方","collect":false,"courseId":13,"desc":"<p>我们一般并不会用到过长的字符串，但是实际上 String 可存储字符串的长度是有约束的，问题来了：<\/p>\r\n<ol>\r\n<li>最长是多少？<\/li>\r\n<li>为什么？<\/li>\r\n<\/ol>\r\n<p>小 tip：注意区分String字面量和String变量。<\/p>","descMd":"","envelopePic":"","fresh":false,"id":12701,"link":"https://www.wanandroid.com/wenda/show/12701","niceDate":"2020-04-08 23:58","niceShareDate":"2020-04-01 00:11","origin":"","prefix":"","projectLink":"","publishTime":1586361497000,"selfVisible":0,"shareDate":1585671069000,"shareUser":"","superChapterId":440,"superChapterName":"问答","tags":[{"name":"本站发布","url":"/article/list/0?cid=440"},{"name":"问答","url":"/wenda"}],"title":"每日一问 | 我们经常用的 String类型，你知道它最大可以放多长的字符串吗？","type":0,"userId":2,"visible":1,"zan":5},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":12785,"link":"https://juejin.im/post/5e8b4b69f265da47f25609ce","niceDate":"2020-04-08 10:19","niceShareDate":"2020-04-08 10:19","origin":"","prefix":"","projectLink":"","publishTime":1586312376000,"selfVisible":0,"shareDate":1586312376000,"shareUser":"Amter","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"Android 你不得不学的HTTP相关知识","type":0,"userId":49976,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"鸿洋","canEdit":false,"chapterId":408,"chapterName":"鸿洋","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":12836,"link":"https://mp.weixin.qq.com/s/MOWdbI5IREjQP1Px-WJY1Q","niceDate":"2020-04-08 00:00","niceShareDate":"1天前","origin":"","prefix":"","projectLink":"","publishTime":1586275200000,"selfVisible":0,"shareDate":1586743892000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/408/1"}],"title":"一个至今仍有很多人写错的技术点！","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"code小生","canEdit":false,"chapterId":414,"chapterName":"code小生","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":12850,"link":"https://mp.weixin.qq.com/s/Zy4xiyHZA4jgbmOlv7fKrA","niceDate":"2020-04-08 00:00","niceShareDate":"1天前","origin":"","prefix":"","projectLink":"","publishTime":1586275200000,"selfVisible":0,"shareDate":1586744698000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/414/1"}],"title":"趁手利器，FSuper","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"code小生","canEdit":false,"chapterId":414,"chapterName":"code小生","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":12851,"link":"https://mp.weixin.qq.com/s/vjXBdLw_L0dW8l5SKnyeGw","niceDate":"2020-04-08 00:00","niceShareDate":"1天前","origin":"","prefix":"","projectLink":"","publishTime":1586275200000,"selfVisible":0,"shareDate":1586744710000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/414/1"}],"title":"Git 如何优雅地回退代码","type":0,"userId":-1,"visible":1,"zan":0}]
         * offset : 20
         * over : false
         * pageCount : 415
         * size : 20
         * total : 8286
         */

        private int curPage;
        private int offset;
        private boolean over;
        private int pageCount;
        private int size;
        private int total;
        private List<DatasBean> datas;

        public int getCurPage() {
            return curPage;
        }

        public void setCurPage(int curPage) {
            this.curPage = curPage;
        }

        public int getOffset() {
            return offset;
        }

        public void setOffset(int offset) {
            this.offset = offset;
        }

        public boolean isOver() {
            return over;
        }

        public void setOver(boolean over) {
            this.over = over;
        }

        public int getPageCount() {
            return pageCount;
        }

        public void setPageCount(int pageCount) {
            this.pageCount = pageCount;
        }

        public int getSize() {
            return size;
        }

        public void setSize(int size) {
            this.size = size;
        }

        public int getTotal() {
            return total;
        }

        public void setTotal(int total) {
            this.total = total;
        }

        public List<DatasBean> getDatas() {
            return datas;
        }

        public void setDatas(List<DatasBean> datas) {
            this.datas = datas;
        }

        public static class DatasBean {
            @Override
            public String toString() {
                return "DatasBean{" +
                        "apkLink='" + apkLink + '\'' +
                        ", audit=" + audit +
                        ", author='" + author + '\'' +
                        ", canEdit=" + canEdit +
                        ", chapterId=" + chapterId +
                        ", chapterName='" + chapterName + '\'' +
                        ", collect=" + collect +
                        ", courseId=" + courseId +
                        ", desc='" + desc + '\'' +
                        ", descMd='" + descMd + '\'' +
                        ", envelopePic='" + envelopePic + '\'' +
                        ", fresh=" + fresh +
                        ", id=" + id +
                        ", link='" + link + '\'' +
                        ", niceDate='" + niceDate + '\'' +
                        ", niceShareDate='" + niceShareDate + '\'' +
                        ", origin='" + origin + '\'' +
                        ", prefix='" + prefix + '\'' +
                        ", projectLink='" + projectLink + '\'' +
                        ", publishTime=" + publishTime +
                        ", selfVisible=" + selfVisible +
                        ", shareDate=" + shareDate +
                        ", shareUser='" + shareUser + '\'' +
                        ", superChapterId=" + superChapterId +
                        ", superChapterName='" + superChapterName + '\'' +
                        ", title='" + title + '\'' +
                        ", type=" + type +
                        ", userId=" + userId +
                        ", visible=" + visible +
                        ", zan=" + zan +
                        ", tags=" + tags +
                        '}';
            }

            /**
             * apkLink :
             * audit : 1
             * author :
             * canEdit : false
             * chapterId : 510
             * chapterName : 大厂分享
             * collect : false
             * courseId : 13
             * desc :
             * descMd :
             * envelopePic :
             * fresh : false
             * id : 12816
             * link : https://juejin.im/post/5e9059bf6fb9a03c621679cf
             * niceDate : 1天前
             * niceShareDate : 2天前
             * origin :
             * prefix :
             * projectLink :
             * publishTime : 1586694643000
             * selfVisible : 0
             * shareDate : 1586654067000
             * shareUser : goweii
             * superChapterId : 510
             * superChapterName : 大厂对外分享
             * tags : []
             * title : Gradle 与 Android 构建入门
             * type : 0
             * userId : 20382
             * visible : 1
             * zan : 0
             */

            private String apkLink;
            private int audit;
            private String author;
            private boolean canEdit;
            private int chapterId;
            private String chapterName;
            private boolean collect;
            private int courseId;
            private String desc;
            private String descMd;
            private String envelopePic;
            private boolean fresh;
            private int id;
            private String link;
            private String niceDate;
            private String niceShareDate;
            private String origin;
            private String prefix;
            private String projectLink;
            private long publishTime;
            private int selfVisible;
            private long shareDate;
            private String shareUser;
            private int superChapterId;
            private String superChapterName;
            private String title;
            private int type;
            private int userId;
            private int visible;
            private int zan;
            private List<?> tags;

            public String getApkLink() {
                return apkLink;
            }

            public void setApkLink(String apkLink) {
                this.apkLink = apkLink;
            }

            public int getAudit() {
                return audit;
            }

            public void setAudit(int audit) {
                this.audit = audit;
            }

            public String getAuthor() {
                return author;
            }

            public void setAuthor(String author) {
                this.author = author;
            }

            public boolean isCanEdit() {
                return canEdit;
            }

            public void setCanEdit(boolean canEdit) {
                this.canEdit = canEdit;
            }

            public int getChapterId() {
                return chapterId;
            }

            public void setChapterId(int chapterId) {
                this.chapterId = chapterId;
            }

            public String getChapterName() {
                return chapterName;
            }

            public void setChapterName(String chapterName) {
                this.chapterName = chapterName;
            }

            public boolean isCollect() {
                return collect;
            }

            public void setCollect(boolean collect) {
                this.collect = collect;
            }

            public int getCourseId() {
                return courseId;
            }

            public void setCourseId(int courseId) {
                this.courseId = courseId;
            }

            public String getDesc() {
                return desc;
            }

            public void setDesc(String desc) {
                this.desc = desc;
            }

            public String getDescMd() {
                return descMd;
            }

            public void setDescMd(String descMd) {
                this.descMd = descMd;
            }

            public String getEnvelopePic() {
                return envelopePic;
            }

            public void setEnvelopePic(String envelopePic) {
                this.envelopePic = envelopePic;
            }

            public boolean isFresh() {
                return fresh;
            }

            public void setFresh(boolean fresh) {
                this.fresh = fresh;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getLink() {
                return link;
            }

            public void setLink(String link) {
                this.link = link;
            }

            public String getNiceDate() {
                return niceDate;
            }

            public void setNiceDate(String niceDate) {
                this.niceDate = niceDate;
            }

            public String getNiceShareDate() {
                return niceShareDate;
            }

            public void setNiceShareDate(String niceShareDate) {
                this.niceShareDate = niceShareDate;
            }

            public String getOrigin() {
                return origin;
            }

            public void setOrigin(String origin) {
                this.origin = origin;
            }

            public String getPrefix() {
                return prefix;
            }

            public void setPrefix(String prefix) {
                this.prefix = prefix;
            }

            public String getProjectLink() {
                return projectLink;
            }

            public void setProjectLink(String projectLink) {
                this.projectLink = projectLink;
            }

            public long getPublishTime() {
                return publishTime;
            }

            public void setPublishTime(long publishTime) {
                this.publishTime = publishTime;
            }

            public int getSelfVisible() {
                return selfVisible;
            }

            public void setSelfVisible(int selfVisible) {
                this.selfVisible = selfVisible;
            }

            public long getShareDate() {
                return shareDate;
            }

            public void setShareDate(long shareDate) {
                this.shareDate = shareDate;
            }

            public String getShareUser() {
                return shareUser;
            }

            public void setShareUser(String shareUser) {
                this.shareUser = shareUser;
            }

            public int getSuperChapterId() {
                return superChapterId;
            }

            public void setSuperChapterId(int superChapterId) {
                this.superChapterId = superChapterId;
            }

            public String getSuperChapterName() {
                return superChapterName;
            }

            public void setSuperChapterName(String superChapterName) {
                this.superChapterName = superChapterName;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public int getType() {
                return type;
            }

            public void setType(int type) {
                this.type = type;
            }

            public int getUserId() {
                return userId;
            }

            public void setUserId(int userId) {
                this.userId = userId;
            }

            public int getVisible() {
                return visible;
            }

            public void setVisible(int visible) {
                this.visible = visible;
            }

            public int getZan() {
                return zan;
            }

            public void setZan(int zan) {
                this.zan = zan;
            }

            public List<?> getTags() {
                return tags;
            }

            public void setTags(List<?> tags) {
                this.tags = tags;
            }
        }
    }
}
