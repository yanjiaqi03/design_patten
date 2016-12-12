package com.huai.designpattern.decorate;

/**
 * com.huai.designpattern.decorate.Decorate
 *
 * @author 阎佳琪
 * @date 16/12/9 下午5:14
 * @desc Decorate
 */

public abstract class Decorate implements House {
    protected House mHouse;

    public Decorate(House house) {
        mHouse = house;
    }
}
