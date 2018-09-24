package com.DesignPatterns.ac.decorator_buffer;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Test {
	public static void copyMp3() {
		try {
			BufferedInputStream buf = new BufferedInputStream(new FileInputStream("audio.mp3"));

			BufferedOutputStream buo = new BufferedOutputStream(new FileOutputStream("audioCapy.mp3"));
			int ch = 0;
			while ((ch = buf.read()) != -1) {
				buo.write(ch);
			}
			buf.close();
			buo.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}