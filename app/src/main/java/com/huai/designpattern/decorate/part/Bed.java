package com.huai.designpattern.decorate.part;

import com.huai.designpattern.decorate.Decorate;
import com.huai.designpattern.decorate.House;

/**
 * com.huai.designpattern.decorate.part.Bed
 *
 * @author 阎佳琪
 * @date 16/12/9 下午5:16
 * @desc Bed
 */

public class Bed extends Decorate {
    public Bed(House house) {
        super(house);
    }

    @Override
    public String getName() {
        return mHouse.getName() + "\n" + "Bed";
    }

    @Override
    public int cost() {
        return mHouse.cost() + 10;
    }
}
