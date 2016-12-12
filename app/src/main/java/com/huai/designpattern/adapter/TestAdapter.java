package com.huai.designpattern.adapter;

/**
 * com.huai.designpattern.adapter.TestAdapter
 *
 * @author 阎佳琪
 * @date 16/12/12 上午10:46
 * @desc TestAdapter
 */

public class TestAdapter {
    public static void main(String[] args) {
        IPhone tIPhone = new IPhone();
        tIPhone.charge();

        Android tAndroid = new Android();
        tAndroid.charge();

        // iphone 用 android 的充电器
        IPhoneCharge tAdapter = new AndroidChargeAdapter(tAndroid);
        tAdapter.charge();
    }
}
