package com.DesignPatterns.aa.introduction7;
/**
 * 
 * @author qingruihappy
 * @data   2018年9月19日 下午11:24:47
 * @说明:经过这样的处理我们就可以在实例类中的构造方法也不需要实例化代码了，只需要在
 * 超类中加一个set方法，这样就可以了。
 * 我们还是按照思路走一遍
 * 1，首先我们秉承着变和不变分开和面向接口编程的原则，首先把变的东西抽出来而且让他们来继承统一的接口也就是我们本次实现的
 * FlyBehavior----FlyNoWay，FlyWithWings
 * QuackBehavior----Quack，Squeak，MuteQuack，
 * 2，这个时候接口是不变的，所以我们把接口FlyBehavior，QuackBehavior放到不变的Duck超类里面来。
 * 3，这个工作做好了，那么我们怎么让新实例的唐老鸭MallardDuck实例类在它们之间产生联系呢，这个是难点也是精髓。
 * 4，首先我们需要确定让超类Duck指向他的实例类唐老鸭MallardDuck，这样可以用多态Duck mallard = new MallardDuck()
 * 来实现，这样我们运行的时候就是唐老鸭的实例了。Duck就是MallardDuck了。
 * 5，这一步和上面introduction6就不一样了，这种方法更加面向借口编程，就是在实例对象MallardDuck中也没有对行为进行操作
 * 但是我们必须要确定FlyBehavior QuackBehavior指向的是谁的实例了，现在就是在Duck中加一个set方法，当调用的时候就把set
 * 的实例放进去，这个时候就确定了，这更想我们平常用spring开发的时候注入的时候用的set的方法。
 */
public class Test {
	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		mallard.setFlyBehavior(new FlyNoWay());
		mallard.setQuackBehavior(new Quack());
		mallard.performQuack();
		mallard.performFly();
	}
}
