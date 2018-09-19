package com.DesignPatterns.aa.introduction6;
/**
 * 
 * @author qingruihappy
 * @data   2018年9月19日 下午11:24:47
 * @说明:
 * 1，变化的与不变的分离开来
 * 2，面向接口编程
 * 3，变化的东西都去实现定义的接口
 * 4，剩下的就是如何让变化的代码和不变的代码联系起来。
 * 5，把定义好的接口（不变的）放到超类（不变的）中，也就是不变的代码，所以可以看到整个类中都是不变的。
 * 5.1，下面就是确认这个接口指向那个实例
 * 5.2，这里要确定两个地方1，确定我是谁，我是duck的那个实例，这个在调用的时候用多态就解决了，
 * 2，确定我是唐老鸭，我有什么样的行为，这个在确定了我是唐老鸭之后，会在唐老鸭的构造方法里确定我的行为，
 * 比如我会飞，我是呱呱的叫。补充：这里也可以用set方法来确定我的行为。这也就是为什么我们在spring的框架中提供set方法的原因了，提供set方法。
 * 6，在子类中（变化的），构造方法中有接口指向它的实现类（变化的）。
 *  7，当我们做测试的时候，多态超类（不变的）指向它的实现类（变化的），因为在实现类中的构造方法中已经指向了接口的实例（变化的）
 *  这个就是就确定了接口调用对象的实例了。
 *  
 *  我们来从正面捋一下思路
 *  1，首先我们秉承着变和不变分开和面向接口编程的原则，首先把变的东西抽出来而且让他们来继承统一的接口也就是我们本次实现的
 *  FlyBehavior----FlyNoWay，FlyWithWings
 *  QuackBehavior----Quack，Squeak，MuteQuack，
 *  2，这个时候接口是不变的，所以我们把接口FlyBehavior，QuackBehavior放到不变的Duck超类里面来。
 *  3，这个工作做好了，那么我们怎么让新实例的唐老鸭MallardDuck实例类在它们之间产生联系呢，这个是难点也是精髓。
 *  4，首先我们需要确定让超类Duck指向他的实例类唐老鸭MallardDuck，这样可以用多态Duck mallard = new MallardDuck()
 *  来实现，这样我们运行的时候就是唐老鸭的实例了。
 *  5，紧接着我们怎么来确定唐老鸭特殊的行为呢，也就是FlyBehavior，QuackBehavior，也要指向它的实现类，这个时候我们就可以在
 *  构造方法里面来实现了quackBehavior = new Quack();flyBehavior = new FlyWithWings()这个时候运行的时候执行
 *  的就是特殊的方法了。
 *  
 *  这个时候即使我们新增一个实例野鸡鸭，它有时候会飞有时候不会飞，这个时候我们就不需要来修改原来代码的逻辑，只需要新增
 *  一个有时候会飞有时候不会飞的动作的实例继承飞的接口，让后在新增一个野鸡鸭的实例就可以了。
 *  
 *  但是这里我们还有一个问题就是在构造器里面放置实例的操作是不符合面向借口编程的原理的。下面我们来看introduction7
 */
public class Test {
	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		mallard.performQuack();
		mallard.performFly();
	}
}
