package com.huai.designpattern.factory.phone;

/**
 * com.huai.designpattern.factory.phone.ApplePhone
 *
 * @author 阎佳琪
 * @date 16/11/24 下午3:06
 * @desc 苹果手机
 */

public class ApplePhone extends AbsPhone {
    public ApplePhone(String phoneName, int price) {
        super(phoneName, price);
    }

    @Override
    public void assemble() {
        System.out.println("组装 -> " + mPhoneName);
    }

    @Override
    public void packaging() {
        System.out.println("包装 -> " + mPhoneName);
    }

    @Override
    public void order() {
        System.out.println(mPhoneName + " -> 下单 -> " + mPrice);
    }
}
