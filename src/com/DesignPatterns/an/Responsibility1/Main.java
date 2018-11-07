package com.DesignPatterns.an.Responsibility1;
/**
 * 这个是责任链设计模式（拦截器设计模式）的入门
 * @author qingruihappy
 * @data   2018年11月5日 下午11:48:05
 * @说明:主要设计思路就是让所有的拦截器都实现同样的接口，让后把所有的拦截器都放在一个list集合中来。
 * 假如在加一个拦截器的话就会拦截器的process方法是不用变的，只需要在Filter[] filters的数组中把已经实现了
 * Filter接口的实现类加进来就行了。
 * 
 * 但是现在假如我们在拦截器的中间在加一组拦截器怎么办呢？
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String msg = "大家好:)，<script>，敏感，被就业，网络授课没感觉，因为看不见大家伙儿";
		MsgProcessor mp = new MsgProcessor();
		mp.setMsg(msg);
		
		String result = mp.process();
		System.out.println(result);
	}

}
