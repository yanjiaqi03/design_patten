package com.huai.designpattern.singleton;

/**
 * com.huai.designpattern.singleton.Instance2
 *
 * @author 阎佳琪
 * @date 16/11/28 下午9:24
 * @desc 单例的第二种写法   volatile 考虑到java运行时重排序，并发导致地址有值但是实例并没有完全创建
 */

public class Instance2 {
    private static volatile Instance2 sInstance;

    public static Instance2 getInstance() {
        if (sInstance == null) {
            synchronized (Instance2.class) {
                if (sInstance == null) {
                    sInstance = new Instance2();
                }
            }
        }

        return sInstance;
    }

    private Instance2() {

    }
}
