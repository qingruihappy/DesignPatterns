package com.DesignPatterns.ac.decorator1;

import java.io.BufferedReader;
import java.io.IOException;

public class BufferedQuto2 extends BufferedReader {
	// 在内部维护一个被装饰的类
	BufferedReader bufferedReader;

	public BufferedQuto2(BufferedReader bufferedReader) { // new BufferedSemi2();
		super(bufferedReader); // 只是为了让代码不报错..
		this.bufferedReader = bufferedReader;
	}

	public String readLine() throws IOException {
		String line = bufferedReader.readLine(); // 如果这里的ReadLine方法是调用了buffereLineNum的readLine方法，问题马上解决。
		if (line == null) {
			return null;
		}
		line = "\"" + line + "\"";
		return line;
	}

}
