package com.DesignPatterns.an.Responsibility3;

public class FaceFilter implements Filter {

	@Override
	public String doFilter(String str) {
		return str.replace(":)", "^V^");
	}

}
