package com.DesignPatterns.ac.decorator1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Demo2 {
	public static void main(String[] args) throws IOException {
		File file = new File("F:\\Demo1.java");
		FileReader fileReader = new FileReader(file);
		// 建立缓冲输入字符流
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		// 建立带行号的缓冲输入字符流
		BufferedLineNum2 bufferedLineNum = new BufferedLineNum2(bufferedReader);
		// 带分号的缓冲输入字符流
		BufferedSemi2 bufferedSemi2 = new BufferedSemi2(bufferedLineNum);
		// 带双引号的缓冲输入字符流
		BufferedQuto2 bufferedQuto2 = new BufferedQuto2(bufferedSemi2);
		String line = null;
		while ((line = bufferedQuto2.readLine()) != null) {
			System.out.println(line);
		}
	}
}