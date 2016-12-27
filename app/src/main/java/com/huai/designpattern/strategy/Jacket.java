package com.huai.designpattern.strategy;

/**
 * com.huai.designpattern.strategy.Jacket
 *
 * @author 阎佳琪
 * @date 16/12/27 上午10:36
 * @desc Jacket
 */

public class Jacket implements IStrategy {
    @Override
    public void cost() {
        System.out.println("Jacket cost $299");
    }
}
