package com.huai.designpattern.observer.sub;

import com.huai.designpattern.observer.obs.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * com.huai.designpattern.observer.sub.Game
 *
 * @author 阎佳琪
 * @date 16/11/21 下午9:14
 * @desc 游戏主题
 */
public class Game implements Subject {
    private List<Observer> mObservers;

    public Game() {
        mObservers = new ArrayList<>();
    }

    @Override
    public synchronized void registerObserver(Observer observer) {
        if (observer == null || mObservers.contains(observer)) {
            return;
        }
        mObservers.add(observer);
    }

    @Override
    public synchronized void unRegisterObserver(Observer observer) {
        if (observer == null) {
            return;
        }
        mObservers.remove(observer);
    }

    @Override
    public synchronized void notifyObservers() {
        for (int i = 0;i < mObservers.size();i++) {
            mObservers.get(i).printf(String.valueOf(i));
        }
    }
}
