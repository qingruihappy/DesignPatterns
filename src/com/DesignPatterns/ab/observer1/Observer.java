package com.DesignPatterns.ab.observer1;

//观察者
public interface Observer {
  public void update(float temp, float humidity, float pressure);
}
