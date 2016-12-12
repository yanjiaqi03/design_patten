package com.huai.designpattern.observer.obs;

/**
 * com.huai.designpattern.observer.obs.Teacher
 *
 * @author 阎佳琪
 * @date 16/11/21 下午9:22
 * @desc 老师
 */
public class Teacher implements Observer {
    @Override
    public void printf(String s) {
        System.out.println("Teacher say : " + s);
    }
}
