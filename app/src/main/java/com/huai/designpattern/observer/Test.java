package com.huai.designpattern.observer;

import com.huai.designpattern.observer.obs.Student;
import com.huai.designpattern.observer.obs.Teacher;
import com.huai.designpattern.observer.sub.Game;

/**
 * com.huai.designpattern.observer.Test
 *
 * @author 阎佳琪
 * @date 16/11/24 上午10:37
 * @desc 文件描述
 */

public class Test {
    public static void main(String[] args) {
        //定义主题
        Game tGame = new Game();

        //创建观察者
        Student tStudent = new Student();
        Teacher tTeacher = new Teacher();

        //订阅
        tGame.registerObserver(tStudent);
        tGame.registerObserver(tTeacher);

        //通知
        tGame.notifyObservers();
    }
}
