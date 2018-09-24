package com.DesignPatterns.ac.decorator1;

import java.io.BufferedReader;
import java.io.IOException;

public class BufferedLineNum2 extends BufferedReader {
	// 在内部维护一个被装饰类的引用。
	BufferedReader bufferedReader;
	int count = 1;

	public BufferedLineNum2(BufferedReader bufferedReader) {
		super(bufferedReader);// 注意： 该语句没有任何的作用，只不过是为了让代码不报错。
		this.bufferedReader = bufferedReader;
	}

	public String readLine() throws IOException {
		String line = bufferedReader.readLine();
		if (line == null) {
			return null;
		}
		line = count + " " + line;
		count++;
		return line;
	}

}
