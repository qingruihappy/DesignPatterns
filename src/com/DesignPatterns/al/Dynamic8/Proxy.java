package com.DesignPatterns.al.Dynamic8;

import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;

import javax.tools.JavaCompiler;
import javax.tools.JavaCompiler.CompilationTask;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;

public class Proxy {
public static Object newProxyInstance(Class inferance) throws Exception {
	String methodStr = "";
	Method[] methods = inferance.getMethods();
	String rt="\r\n";
	
	for(Method m : methods) {
		methodStr += "@Override" + rt + 
					 "public void " + m.getName() + "() {" + rt +
					 	"   long start = System.currentTimeMillis();" + rt +
						"   System.out.println(\"starttime:\" + start);" + rt +
						"   t." + m.getName() + "();" + rt +
						"   long end = System.currentTimeMillis();" + rt +
						"   System.out.println(\"time:\" + (end-start));" + rt +
					 "}";
	}
	String src=
			"package com.DesignPatterns.al.Dynamic8;"+rt+

			"public class TankTime implements "+inferance.getName()+ "{"+rt+
			"	Moveable t;"+rt+

			"	public TankTime(Moveable t) {"+rt+
			"		super();"+rt+
			"		this.t = t;"+rt+
			"	}"+rt+

			methodStr +rt+

			"}";
	//1,生成代理类
	String fileName = System.getProperty("user.dir");
	System.out.println("fileName是项目的根路径："+fileName);
	String fileNameEnd=fileName+"/src/com/DesignPatterns/al/Dynamic8/TankTime.java";
	
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
	Class c = ul.loadClass("com.DesignPatterns.al.Dynamic8.TankTime");
	System.out.println("加载我的class文件是"+c);
	
	//4,从内存中生成对象
	//4.1,我们调用的是构造方法的参数为Moveable（上面的参数是它的实现也可以的）类型的构造方法
	Constructor ctr = c.getConstructor(Moveable.class);
	Object o = ctr.newInstance(new Tank());
	return o;
	
}
}
