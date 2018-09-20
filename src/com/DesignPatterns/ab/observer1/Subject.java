package com.DesignPatterns.ab.observer1;

/**
 * 定义了对象之间的一对多依赖，这样一来，当一个对象改变状态时，它的所有依赖者都会收到通知并自动更新
 * 
 * @author 88403097
 * @date 2018年9月20日
 */
public interface Subject {
    // 注册
    public void registerObserver(Observer o);

    // 注销
    public void removeObserver(Observer o);

    // 通知
    public void notifyObservers();
}
