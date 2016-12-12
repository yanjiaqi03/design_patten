package com.huai.designpattern.adapter;

/**
 * com.huai.designpattern.adapter.AndroidChargeAdapter
 *
 * @author 阎佳琪
 * @date 16/12/12 上午10:44
 * @desc AndroidChargeAdapter
 */

public class AndroidChargeAdapter implements IPhoneCharge {
    private AndroidCharge mAndroidCharge;

    public AndroidChargeAdapter(AndroidCharge androidCharge) {
        mAndroidCharge = androidCharge;
    }

    @Override
    public void charge() {
        mAndroidCharge.charge();
    }
}
