package com.DesignPatterns.ab.observer1;

/**
 * 
 * @author 88403097
 * @date 2018年9月20日
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private Subject subject;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.subject = weatherData;
        subject.registerObserver(this);
    }

    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    public void display() {
        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
    }
}
