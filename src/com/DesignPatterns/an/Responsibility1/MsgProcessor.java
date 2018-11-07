package com.DesignPatterns.an.Responsibility1;

public class MsgProcessor {
	private String msg;
	
	Filter[] filters = {new HTMLFilter(), new SesitiveFilter(), new FaceFilter()};

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String process() {
		String r=msg;
		for(Filter f:filters) {
			f.doFilter(r);
		}
		return r;
		
		
	}
}
