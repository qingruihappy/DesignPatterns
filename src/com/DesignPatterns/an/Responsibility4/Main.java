package com.DesignPatterns.an.Responsibility4;
/**
 * 
 * @author qingruihappy
 * @data   2018年11月6日 上午12:23:38
 * @说明:这个主要处理的就是有请求有返回的，而且要遵循先进后出的逻辑堆栈的逻辑
 * 这里主要用到了递归的方法。其实也简单
 * 我们来写一下它的思路
 * 1：我们先把HTMLFilter，SesitiveFilter两个过滤器加载到过滤器链中。
 * 2：调用FilterChain的doFilter方法，我们初始化index的索引是0，这个时候index++之后就会变成1，而现在我们get（0）的时候就会获取到
 * HTMLFilter的doFilter方法，执行HTMLFilter里面的替换的方法。
 * 3，当在HTMLFilter执行完之后会执行FilterChain里面的doFilter的方法，因为这个时候index是1了，这个时候会把index++后设置成2，让后执行
 * SesitiveFilter里面的doFilter方法，在执行完SesitiveFilter里面的替换的方法之后。
 * 4，接着调用FilterChain里面的doFilter的方法，这个时候发现index是2了就会返回
 * 5，首先它会遵循方法堆栈中的先进后出的原则，回到SesitiveFilter类中执行response的相关代码
 * 6，然后在回到HTMLFilter类中执行response的方法
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String msg = "大家好:)，<script>，敏感，被就业，网络授课没感觉，因为看不见大家伙儿";
		Request request = new Request();
		request.setRequestStr(msg);
		Response response = new Response();
		response.setResponseStr("response");
		FilterChain fc = new FilterChain();
		fc.addFilter(new HTMLFilter())
		  .addFilter(new SesitiveFilter())
		  ;
		
		fc.doFilter(request, response, fc);
		System.out.println(request.getRequestStr());
		System.out.println(response.getResponseStr());
	}

}
