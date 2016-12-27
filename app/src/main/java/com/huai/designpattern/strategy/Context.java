package com.huai.designpattern.strategy;

/**
 * com.huai.designpattern.strategy.Context
 *
 * @author 阎佳琪
 * @date 16/12/27 上午10:37
 * @desc Context
 */

public class Context {
    private IStrategy mStrategy;

    public void setStrategy(IStrategy strategy) {
        mStrategy = strategy;
    }

    public void cost() {
        mStrategy.cost();
    }
}
