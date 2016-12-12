package com.huai.designpattern.decorate.part;

import com.huai.designpattern.decorate.Decorate;
import com.huai.designpattern.decorate.House;

/**
 * com.huai.designpattern.decorate.part.Sofa
 *
 * @author 阎佳琪
 * @date 16/12/9 下午5:22
 * @desc Sofa
 */

public class Sofa extends Decorate {
    public Sofa(House house) {
        super(house);
    }

    @Override
    public String getName() {
        return mHouse.getName() + "\n" + "Sofa";
    }

    @Override
    public int cost() {
        return mHouse.cost() + 20;
    }
}
