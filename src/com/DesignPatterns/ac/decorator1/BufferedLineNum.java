package com.DesignPatterns.ac.decorator1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;

public class BufferedLineNum extends BufferedReader{
	//ÐÐºÅ 
		int count = 1 ;
		public BufferedLineNum(Reader in) {
			super(in);
		}
		public String readLine() throws IOException {
			String line = super.readLine(); 
			if(line ==null){
				return null;
			}
			line = count+" "+ line;
			count++;
			return line;
		}

}
