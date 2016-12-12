package com.huai.designpattern.adapter;

/**
 * com.huai.designpattern.adapter.Android
 *
 * @author 阎佳琪
 * @date 16/12/12 上午10:43
 * @desc Android
 */

public class Android implements AndroidCharge {
    @Override
    public void charge() {
        System.out.println("Android charging");
    }
}
