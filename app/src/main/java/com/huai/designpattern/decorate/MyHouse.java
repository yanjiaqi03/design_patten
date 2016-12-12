package com.huai.designpattern.decorate;

/**
 * com.huai.designpattern.decorate.MyHouse
 *
 * @author 阎佳琪
 * @date 16/12/9 下午5:23
 * @desc MyHouse
 */

public class MyHouse implements House {
    @Override
    public String getName() {
        return "MyHouse :";
    }

    @Override
    public int cost() {
        return 100;
    }
}
