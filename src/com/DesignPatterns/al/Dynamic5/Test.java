package com.DesignPatterns.al.Dynamic5;

import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Constructor;
import java.net.URL;
import java.net.URLClassLoader;

import javax.tools.JavaCompiler;
import javax.tools.JavaCompiler.CompilationTask;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
public class Test {
	public static void main(String[] args) throws Exception {
		String rt="\r\n";
		String src=
				"package com.DesignPatterns.al.Dynamic5;"+rt+

				"public class TankTime implements Moveable {"+rt+
				"	Moveable t;"+rt+

				"	public TankTime(Moveable t) {"+rt+
				"		super();"+rt+
				"		this.t = t;"+rt+
				"	}"+rt+

				"	@Override"+rt+
				"	public void move() {"+rt+

				"		long startTime = System.currentTimeMillis();"+rt+
				"		System.out.println(\"tank开始打印开始时间\"+startTime);"+rt+
				"		t.move();"+rt+
				"		long endTime = System.currentTimeMillis();"+rt+
				"		System.out.println(\"tank总共花费时间是\" + (endTime - startTime));"+rt+
				"	}"+rt+

				"}";
		//1,生成代理类
		String fileName = System.getProperty("user.dir");
		System.out.println("fileName是项目的根路径："+fileName);
		String fileNameEnd=fileName+"/src/com/DesignPatterns/al/Dynamic5/TankTime.java";
		
		File f=new File(fileNameEnd);
		FileWriter fw=new FileWriter(f);
		fw.write(src);
		fw.flush();
		fw.close();
		
		//2,开始生成class文件,进行编译
		//2.1,获取java默认的编译器，说白了就是javac
		JavaCompiler compiler=ToolProvider.getSystemJavaCompiler();
		System.out.println("现在我的编译器是"+compiler.getClass().getName());
		StandardJavaFileManager fileMgr = compiler.getStandardFileManager(null, null, null);
		Iterable units = fileMgr.getJavaFileObjects(fileNameEnd);
		CompilationTask t = compiler.getTask(null, fileMgr, null, null, null, units);
		//2.2,生成class文件这里不是重点，我们知道通过上面的代码就可以把java代码生成到指定的目录下面的class文件
		t.call();
		fileMgr.close();
		
		
		//3,把class文件加载到内存中去
		URL[] urls = new URL[] {new URL("file:/" + System.getProperty("user.dir") +"/src")};
		URLClassLoader ul = new URLClassLoader(urls);
		Class c = ul.loadClass("com.DesignPatterns.al.Dynamic5.TankTime");
		System.out.println("加载我的class文件是"+c);
		
		//4,从内存中生成对象，因为这个时候我们没有这个java类，所以只有从内存中来区这个值。
		//换句话就是说，我们现在没有这个对象，只有通过反射（通过构造器反射来获取这个对象）
		//4.1,我们调用的是构造方法的参数为Moveable（上面的参数是它的实现也可以的）类型的构造方法
		Constructor ctr = c.getConstructor(Moveable.class);
		Moveable m = (Moveable)ctr.newInstance(new Tank());
		m.move();
		}
}
