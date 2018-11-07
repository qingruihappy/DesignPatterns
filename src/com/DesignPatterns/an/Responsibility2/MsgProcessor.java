package com.DesignPatterns.an.Responsibility2;
/**
 * 这个类主要是用来调用FilterChain的
 * @author qingruihappy
 * @data   2018年11月6日 上午12:11:34
 * @说明:
 */
public class MsgProcessor {
	private String msg;
	
	FilterChain fc;
	
	public FilterChain getFc() {
		return fc;
	}

	public void setFc(FilterChain fc) {
		this.fc = fc;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String process() {
		
		
		return fc.doFilter(msg);
		
		
	}
}
