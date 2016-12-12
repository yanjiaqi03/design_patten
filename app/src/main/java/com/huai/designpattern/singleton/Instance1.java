package com.huai.designpattern.singleton;

/**
 * com.huai.designpattern.singleton.Instance1
 *
 * @author 阎佳琪
 * @date 16/11/28 下午9:23
 * @desc 单例的第一种写法
 */

public class Instance1 {
    private static final Instance1 INSTANCE = new Instance1();

    public static Instance1 getInstance() {
        return INSTANCE;
    }

    private Instance1() {

    }
}
