package com.huai.designpattern.command;

/**
 * com.huai.designpattern.command.Command
 *
 * @author 阎佳琪
 * @date 16/12/9 下午1:54
 * @desc Command
 */

public interface Command {
    void execute();
    void undo();
    void redo();
}
