package com.huai.designpattern.factory.phone;

/**
 * com.huai.designpattern.factory.phone.SamsungPhone
 *
 * @author 阎佳琪
 * @date 16/11/24 下午3:11
 * @desc 三星手机
 */

public class SamsungPhone extends AbsPhone {
    public SamsungPhone(String phoneName, int price) {
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
