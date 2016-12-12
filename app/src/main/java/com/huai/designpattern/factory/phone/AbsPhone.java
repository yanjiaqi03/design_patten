package com.huai.designpattern.factory.phone;

/**
 * com.huai.designpattern.factory.phone.AbsPhone
 *
 * @author 阎佳琪
 * @date 16/11/24 下午3:01
 * @desc 手机抽象类
 */

public abstract class AbsPhone {
    public String mPhoneName;
    public int mPrice;

    public AbsPhone(String phoneName, int price) {
        mPhoneName = phoneName;
        mPrice = price;
    }

    /**
     * 组装
     */
    public abstract void assemble();

    /**
     * 包装
     */
    public abstract void packaging();

    /**
     * 下单
     */
    public abstract void order();
}
