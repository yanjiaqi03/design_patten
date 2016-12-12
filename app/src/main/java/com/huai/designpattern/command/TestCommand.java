package com.huai.designpattern.command;

/**
 * com.huai.designpattern.command.TestCommand
 *
 * @author 阎佳琪
 * @date 16/12/9 下午2:34
 * @desc TestCommand
 */

public class TestCommand {
    public static void main(String[] args) {
        Light tLight = new Light();
        LightControl tLightControl = new LightControl(tLight);
        tLightControl.turnOn();
        tLightControl.turnOff();
        tLightControl.openDelayClose(2000L);
    }
}
