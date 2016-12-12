package com.huai.designpattern.factory.store;

import com.huai.designpattern.factory.phone.AbsPhone;
import com.huai.designpattern.factory.phone.ApplePhone;
import com.huai.designpattern.factory.phone.SamsungPhone;

/**
 * com.huai.designpattern.factory.store.PhoneStore
 *
 * @author 阎佳琪
 * @date 16/11/24 下午2:42
 * @desc 手机商店
 */

public class PhoneStore implements IStore {

    public static ApplePhone createApplePhone(String phoneName, int price) {
        return new ApplePhone(phoneName, price);
    }

    public static SamsungPhone createSamsungPhone(String phoneName, int price) {
        return new SamsungPhone(phoneName, price);
    }

    @Override
    public void exec(AbsPhone phone) {
        phone.assemble();
        phone.packaging();
        phone.order();
    }
}
