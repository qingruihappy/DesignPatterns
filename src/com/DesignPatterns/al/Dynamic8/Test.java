package com.DesignPatterns.al.Dynamic8;

/**
 * 
 * @author qingruihappy
 * @data 2018年11月1日 上午12:39:35
 * @说明:现在模拟动态的方法并且打印主方法的内容
 */
public class Test {
	public static void main(String[] args) throws Exception {
		Moveable newProxyInstance = (Moveable) Proxy.newProxyInstance(Moveable.class);
		// 是不是很神奇啊，现在假如我们现在没有看到代理类，我们只有接口类，tank类，还有测试类，
		// 我们直观的来看现在的方法就是，我们把接口传入进入了newProxy这个方法中，它居然动态的给我
		// 打印出了日志还有主方法。
		// 我们不看代理类里面的代码我们闭着眼来想一下它是怎么实现的。
		// 1,首先把不用变的代码以静态string的形式写入进了动态类中
		// 2,把动态变化的东西比如说接口，通过传入的接口来获取，
		// 3,方法，因为接口中就有了实现类的方法，所以通过接口也能获取，其中的方法，
		// 4,那它是怎么来确定实现类就是tank呢而不是其他的呢。往下面看
		// 5,写完了之后生成java文件
		// 6,编译生成class文件
		// 7,加载到内存中来
		// 8,从内从中反射生成对象。（注意这这里传入了tank确定了是tank对象，所以当下面调用）
		// 9,执行下面的方法，就相当于执行刚生成的tanktime里面的方法是一样的。
		newProxyInstance.move();
		// 我们来看看还有什么问题就是动态切入进来的代码不是随机变化的，下面就是让切入进来的代码变成随机变化的。

	}

}
