package com.DesignPatterns.ab.observer1;

/**
 * @author 88403097
 * @date 2018年9月20日 说明： 定义了对象之间的一对多依赖，这样一来，当一个对象改变状态时，它的所有依赖者都会收到通知并自动更新
 *主题变化，weatherData变化通知CurrentConditionsDisplay，StatisticsDisplay，ForecastDisplay发生变化 
 *下面来分析一下是怎么产生的，看一下原理
 *主题和观察者之间是若耦合。
 *一，把架子搭好。
 *   1.1,主题的接口写好，三个抽象方法（注册，取消，通知）Subject
 *   1.2,观察者的接口写好，（更新）Observer
 *二，实现
 *   2.1，实现主题的方法定义一个list假如注册就往list添加对象，假如注销就往list删除对象
 *   ，假如通知，就从list中便利对象然后调用update（更新）的方法，
 *   2.2，观察者的实现注意上面调用update（更新）的方法，这个时候已经确定运行时候确定调用者了，那么
 *   这个时候我们直接实现更新的方法就行了。
 *   2.3，至于这个展示，就好说了，只是在update的时候调用了一下display的方法，因为要统一的设计所以也设计了一个接口
 *三，补充
 *   3.1，注册的逻辑，在观察者的实现中我们还能看到，里面关联着主题的接口，方便我们注册和注销用，在这里为了方便起见
 *   初始化的时候就调用了注册的方法，所以只要调用构造方法就注册成功了。
 *   3.2，所谓的增加和修改程序都是对已经有了的类，接口或者方法来说的。比如说这里假如增加一个Display这个时候不需要修改原来的代码
 *   逻辑的，只需要增加一个Display实现类继承Observer就可以了
 *    
 * 一：注册，把观察者注入到主题中来，规定谁有权限接受到主题的通知
1，new对象的时候，把主题的实现类作为参数传入到观察者的实现类中来
2，这样的话在观察者的构造方法中就有了主题的实现类，在观察者的构造方法中在调用主题接口的方法，因为这个时候已经确定谁是主题的实现类了（传过来的就是，主要是动态主题的）
这样就会到主题的实现类中来调用注册的方法了，无非就是一个list中的add方法。
3，这样在主题的list的方法中就有了观察者了，因为这个时候主题的实例还没有销毁，所以还在内存中的。
二：主题修改通知观察者
现在观察者已经注册完毕了，现在我们调用主题的实现类里面的参数修改的方法，修改会调用统一定义的方法（update），因为观察者统一实现了这个方法，并且观察者全部在注册的list中，这样一来
就可以直接调用观察者的统一定义的方法来实现通知观察者的目的了。
 */
public class Test {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        // 这里是依赖者
        // 这一行相当于注册，通过构造方法
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        /*
         * 建立三个布告板，并把WeatherData对象传给它们。
         */
        // 主题变化，weatherData变化通知CurrentConditionsDisplay，StatisticsDisplay，ForecastDisplay发生变化
         weatherData.setMeasurements(80, 65, 30.4f);
         weatherData.setMeasurements(82, 70, 29.2f);
         weatherData.setMeasurements(78, 90, 29.2f);
         
    }
}
/*
 * 当两个对象之间松耦合，它们依然可以交互，但是不太清楚彼此的细节。 观察者模式提供了一种对象设计，让主题和观察者之间松耦合。 
 * 为什么呢？ 关于观察者的一切，主题只知道观察者实现了某个接口（也就是Observer接口）。主
 * 题不需要知道观察者的具体类是谁、做了些什么或其他任何细节。 任何时候我们都可以增加新的观察者。
 * 因为主题唯一依赖的东西是一个实现 Observer接口的对象列表，所以我们可以随时增加观察者。事实上，在运行时我们可
 * 以用新的观察者取代现有的观察者，主题不会受到任何影响。同样的，也可以在任何 时候删除某些观察者。 
 * 有新类型的观察者出现时，主题的代码不需要修改。假如我们有个新的具体类需要当
 * 观察者，我们不需要为了兼容新类型而修改主题的代码，所有要做的就是在新的类里 实现此观察者接口，然后注册为观察者即可。
 * 主题不在乎别的，它只会发送通知给所 有实现了观察者接口的对象。
 * 我们可以独立地复用主题或观察者。如果我们在其他地方需要使用主题或观察者，可 以轻易地复用，因为二者并非紧耦合。
 * 改变主题或观察者其中一方，并不会影响另一方。因为两者是松耦合的，所以只要他
 * 们之间的接口仍被遵守，我们就可以自由地改变他们。 设计原则 为了交互对象之间的松耦合设计而 努力。
 * 松耦合的设计之所以能让我们建立有弹性的OO系统，能够应对变化， 是因为对象之间的互相依赖降到了最低。
 */