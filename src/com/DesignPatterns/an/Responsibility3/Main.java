package com.DesignPatterns.an.Responsibility3;
/**
 * 这里主要注意的是在一组拦截器中加入另一组拦截器的
 * @author qingruihappy
 * @data   2018年11月6日 上午12:15:36
 * @说明:
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String msg = "大家好:)，<script>，敏感，被就业，网络授课没感觉，因为看不见大家伙儿";
		MsgProcessor mp = new MsgProcessor();
		mp.setMsg(msg);
		FilterChain fc = new FilterChain();
		fc.addFilter(new HTMLFilter())
		  .addFilter(new SesitiveFilter())
		  ;
		//注意在这里让FilterChain也去实现Filter接口，它按照黑盒的思路来看的话其实就是
		//另一个数组，直接在原来的数组中加入另一个数组就行了。看下面的实现。
		FilterChain fc2 = new FilterChain();
		fc2.addFilter(new FaceFilter());
		
		fc.addFilter(fc2);
		mp.setFc(fc);
		String result = mp.process();
		System.out.println(result);
	}

}
