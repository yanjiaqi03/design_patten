package com.huai.designpattern.strategy;

/**
 * com.huai.designpattern.strategy.Jeans
 *
 * @author 阎佳琪
 * @date 16/12/27 上午10:35
 * @desc Jeans
 */

public class Jeans implements IStrategy {
    @Override
    public void cost() {
        System.out.println("jeans cost $159");
    }
}
