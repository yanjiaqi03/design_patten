package com.huai.designpattern.factory;

import com.huai.designpattern.factory.store.PhoneStore;

/**
 * com.huai.designpattern.factory.Test
 *
 * @author 阎佳琪
 * @date 16/11/24 下午4:39
 * @desc 文件描述
 */

public class Test {
    public static void main(String[] args) {
        PhoneStore tPhoneStore = new PhoneStore();

        tPhoneStore.exec(PhoneStore.createApplePhone("apple", 6000));
        tPhoneStore.exec(PhoneStore.createSamsungPhone("samsung", 2999));
    }
}
