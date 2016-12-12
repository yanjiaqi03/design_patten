package com.huai.designpattern.command;

import java.util.HashMap;

/**
 * com.huai.designpattern.command.LightControl
 *
 * @author 阎佳琪
 * @date 16/12/9 下午2:13
 * @desc LightControl
 */

public class LightControl {
    private HashMap<String, Command> mCommandHashMap;

    public LightControl(Light light) {
        mCommandHashMap = new HashMap<>();
        mCommandHashMap.put(LightOnCommand.class.getSimpleName(), new LightOnCommand(light));
        mCommandHashMap.put(LightOffCommand.class.getSimpleName(), new LightOffCommand(light));
    }

    public void turnOn() {
        mCommandHashMap.get(LightOnCommand.class.getSimpleName()).execute();
    }

    public void turnOff() {
        mCommandHashMap.get(LightOffCommand.class.getSimpleName()).execute();
    }

    public void openDelayClose(long delay) {
        turnOn();
        try {
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        turnOff();
    }
}
