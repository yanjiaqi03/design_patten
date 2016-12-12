package com.huai.designpattern.decorate.part;

import com.huai.designpattern.decorate.Decorate;
import com.huai.designpattern.decorate.House;

/**
 * com.huai.designpattern.decorate.part.Television
 *
 * @author 阎佳琪
 * @date 16/12/9 下午5:21
 * @desc Television
 */

public class Television extends Decorate {
    public Television(House house) {
        super(house);
    }

    @Override
    public String getName() {
        return mHouse.getName() + "\n" + "Television";
    }

    @Override
    public int cost() {
        return mHouse.cost() + 30;
    }
}
