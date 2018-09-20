package com.DesignPatterns.ab.observer2;

/**
 * 
 * @author 88403097
 * @date 2018年9月20日 对比见精髓： 一，注册和上面的差不多，只不多是接口改成抽象类了 二，主题修改通知观察者
 *       现在观察者已经注册完毕了，现在我们调用主题的实现类里面的参数修改的方法，修改会调用统一定义的方法（update），
 *       只不过这个时候update的方法不在主题的实现类中了而是在主题的抽象类（父类）中，因为上面对的例子我们是实现的是接口
 *       ，而这里我们继承的是抽象类，观察者现在全部都在list中，
 *       所以这个时候我们可以直接调用观察者的统一定义的方法来实现通知观察者的目的了 ，而参数我们可以通过this关键字，
 *       就是主题实现类，把参数传过去了。
 *       
 *       
 *       1，总上所述就是注册，在主题的list中放入观察者,
 *       2，然后假如主题发生变化，会从list中取出观察者并根据统一定义的方法(update)来通知观察者。
 */
public class Test {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        // 这里是依赖者
        // 这一行相当于注册，通过构造方法
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        /*
         * 建立三个布告板，并把WeatherData对象传给它们。
         */
        // 主题变化，weatherData变化通知CurrentConditionsDisplay，StatisticsDisplay，ForecastDisplay发生变化
        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);

    }
}
