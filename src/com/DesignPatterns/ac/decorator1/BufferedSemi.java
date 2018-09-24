package com.DesignPatterns.ac.decorator1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;

public class BufferedSemi extends BufferedReader{

	public BufferedSemi(Reader in) {
		super(in);
	}
	@Override
	public String readLine() throws IOException {
		String line =  super.readLine();
		if(line==null){
			return null;
		}
		line = line+";";
		return line;
	}

}
