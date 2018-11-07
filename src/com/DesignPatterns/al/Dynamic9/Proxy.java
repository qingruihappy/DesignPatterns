package com.DesignPatterns.al.Dynamic9;

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

/**
 * jdk中的类名是$Proxy1，可以把下面的TankTime替换掉，其实就是一个名字意义不大，都一样
 * 
 * @author qingruihappy
 * @data 2018年11月2日 上午1:24:30
 * @说明:其实可以这样理解对inferance接口里面的方法实行的是什么样（InvocationHandler）日志，时间，事物。。。等等的代理
 */
public class Proxy {
	public static Object newProxyInstance(Class inferance, InvocationHandler h) throws Exception {
		String methodStr = "";
		Method[] methods = inferance.getMethods();
		String rt = "\r\n";

		for (Method m : methods) {
			methodStr += "@Override" + rt + "public void " + m.getName() + "() {" + rt + "    try {" + rt
					+ "    Method md = " + inferance.getName() + ".class.getMethod(\"" + m.getName() + "\");" + rt
					+ "    h.invoke(this, md);" + rt + "    }catch(Exception e) {e.printStackTrace();}" + rt +

					"}";
		}
		String src = "package com.DesignPatterns.al.Dynamic9;" + rt + "import java.lang.reflect.Method;" + rt
				+ "public class TankTime implements " + inferance.getName() + "{" + rt +

				"	public TankTime(InvocationHandler h) {" + rt + "		super();" + rt + "		this.h = h;" + rt
				+ "	}" + rt + "    com.DesignPatterns.al.Dynamic9.InvocationHandler h;" + rt + methodStr + rt +

				"}";
		// 1,生成代理类
		String fileName = System.getProperty("user.dir");
		System.out.println("fileName是项目的根路径：" + fileName);
		String fileNameEnd = fileName + "/src/com/DesignPatterns/al/Dynamic9/TankTime.java";

		File f = new File(fileNameEnd);
		FileWriter fw = new FileWriter(f);
		fw.write(src);
		fw.flush();
		fw.close();

		// 2,开始生成class文件,进行编译
		// 2.1,获取java默认的编译器，说白了就是javac
		JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
		System.out.println("现在我的编译器是" + compiler.getClass().getName());
		StandardJavaFileManager fileMgr = compiler.getStandardFileManager(null, null, null);
		Iterable units = fileMgr.getJavaFileObjects(fileNameEnd);
		CompilationTask t = compiler.getTask(null, fileMgr, null, null, null, units);
		// 2.2,生成class文件这里不是重点，我们知道通过上面的代码就可以把java代码生成到指定的目录下面的class文件
		t.call();
		fileMgr.close();

		// 3,把class文件加载到内存中去
		URL[] urls = new URL[] { new URL("file:/" + System.getProperty("user.dir") + "/src") };
		URLClassLoader ul = new URLClassLoader(urls);
		Class c = ul.loadClass("com.DesignPatterns.al.Dynamic9.TankTime");
		System.out.println("加载我的class文件是" + c);

		// 4,从内存中生成对象
		// 4.1,我们调用的是构造方法的参数为Moveable（上面的参数是它的实现也可以的）类型的构造方法
		// 其实在这里我们可以更好的理解反射，传统意义上的代码我们都是现有java实体类，让后我们在去new的方法创造内存对象
		// 但是假如现在我们有了使我们动态的java文件,并且已经生成class文件加载到内存中了
		// 但是由于java文件不是我们自己写的，所以我们现在我们看不到java文件，所以就没有办法new对象了
		// 但是我们在内存中已经有了这个对象了，现在我们要用这个对象，这个时候就需要用发射了

		// 下面的代码就是实现了InvocationHandler接口的构造器反射获取构造器，然后再通过newInstance获取对象，h是接口具体的实现类
		Constructor ctr = c.getConstructor(InvocationHandler.class);
		Object o = ctr.newInstance(h);
		return o;

	}
}
