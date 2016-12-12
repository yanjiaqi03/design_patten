package com.huai.designpattern.command;

/**
 * com.huai.designpattern.command.LightOnCommand
 *
 * @author 阎佳琪
 * @date 16/12/9 下午2:03
 * @desc LightOnCommand
 */

public class LightOnCommand implements Command {
    private Light mLight;

    public LightOnCommand(Light light) {
        mLight = light;
    }

    @Override
    public void execute() {
        mLight.on();
    }

    @Override
    public void undo() {
        mLight.off();
    }

    @Override
    public void redo() {
        mLight.on();
    }
}
