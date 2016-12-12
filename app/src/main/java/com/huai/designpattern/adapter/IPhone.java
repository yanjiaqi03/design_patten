package com.huai.designpattern.adapter;

/**
 * com.huai.designpattern.adapter.IPhone
 *
 * @author 阎佳琪
 * @date 16/12/12 上午10:41
 * @desc IPhone
 */

public class IPhone implements IPhoneCharge {
    @Override
    public void charge() {
        System.out.println("IPhone charging");
    }
}
