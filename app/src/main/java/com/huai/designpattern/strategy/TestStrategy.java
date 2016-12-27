package com.huai.designpattern.strategy;

/**
 * com.huai.designpattern.strategy.TestStrategy
 *
 * @author 阎佳琪
 * @date 16/12/27 下午1:20
 * @desc TestStrategy
 */

public class TestStrategy {
    public static void main(String[] args) {
        Context tContext = new Context();
        tContext.setStrategy(new Jeans());
        tContext.cost();
        tContext.setStrategy(new Jacket());
        tContext.cost();
    }
}
