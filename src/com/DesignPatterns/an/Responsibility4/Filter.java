package com.DesignPatterns.an.Responsibility4;

public interface Filter {
	void doFilter(Request request, Response response, FilterChain chain);
}
