package com.DesignPatterns.an.Responsibility3;

import java.util.ArrayList;
import java.util.List;

public class FilterChain implements Filter {
	List<Filter> filters = new ArrayList<Filter>();
	/*注意这里的用法，我们返回的是类本身，这样我们就可以用fc.addFilter(new HTMLFilter())
	  .addFilter(new SesitiveFilter())这种责任链的编码方式了。
	  ;*/
	public FilterChain addFilter(Filter f) {
		this.filters.add(f);
		return this;
	}
	
	public String doFilter(String str) {
		String r = str;
		for(Filter f: filters) {
			r = f.doFilter(r);
		}
		return r;
	}
}
