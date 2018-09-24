package com.DesignPatterns.ac.decorator1;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Demo1 {
	public static void main(String[] args) throws IOException {
		File file = new File("F:\\Demo1.java");
		//建立数据的输入通道
		FileReader fileReader = new FileReader(file);
		//建立带行号的缓冲输入字符流
		BufferedLineNum bufferedLineNum = new BufferedLineNum(fileReader);
		//带有分号的缓冲输入字符流
		BufferedSemi bufferedSemi = new BufferedSemi(fileReader);
		//带有双引号的缓冲输入字符流
		BufferedQuto bufferedQuto = new BufferedQuto(fileReader);
		String line = null;
		while((line = bufferedQuto.readLine())!=null){
			System.out.println(line);
		}
	}
}
