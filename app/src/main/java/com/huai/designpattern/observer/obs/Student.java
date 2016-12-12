package com.huai.designpattern.observer.obs;

/**
 * com.huai.designpattern.observer.obs.Student
 *
 * @author 阎佳琪
 * @date 16/11/21 下午9:22
 * @desc 学生
 */
public class Student implements Observer {
    @Override
    public void printf(String s) {
        System.out.println("Student say : " + s);
    }
}
