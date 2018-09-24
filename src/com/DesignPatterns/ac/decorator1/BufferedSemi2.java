package com.DesignPatterns.ac.decorator1;

import java.io.BufferedReader;
import java.io.IOException;

class BufferedSemi2 extends BufferedReader { // 为什么要继承? 是为了让这些装饰类的对象可以作为参数进行传递，达到互相装饰 的效果。
	// 在内部维护一个被装饰类的引用。
	BufferedReader bufferedReader;

	public BufferedSemi2(BufferedReader bufferedReader) { // new BuffereLineNum();
		super(bufferedReader);// 注意： 该语句没有任何的作用，只不过是为了让代码不报错。
		this.bufferedReader = bufferedReader;
	}

	public String readLine() throws IOException {
		String line = bufferedReader.readLine(); // 如果这里的ReadLine方法是调用了buffereLineNum的readLine方法，问题马上解决。
		if (line == null) {
			return null;
		}
		line = line + ";";
		return line;
	}

}
