package com.huai.designpattern.observer.sub;

import com.huai.designpattern.observer.obs.Observer;

/**
 * com.huai.designpattern.observer.sub.Subject
 *
 * @author 阎佳琪
 * @date 16/11/21 下午8:34
 * @desc 主题
 */
public interface Subject {
    void registerObserver(Observer observer);
    void unRegisterObserver(Observer observer);
    void notifyObservers();
}
