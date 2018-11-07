package com.DesignPatterns.al.Dynamic92;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

import sun.misc.ProxyGenerator;

/**
 * @Author: feiweiwei
 * @Description:
 * @Created Date: 10:00 17/9/22.
 * @Modify by:
 */
public class DynamicProxyMain {

    public static void main(String[] args) throws IOException {
        // 目标类1
        Subject realSubject = new RealSubject();
        // 处理器类
        InvocationHandler handler = new DynamicProxyAOP(realSubject);

        Subject subject = (Subject) Proxy.newProxyInstance(realSubject.getClass().getClassLoader(), realSubject
                .getClass().getInterfaces(), handler);
        subject.doSomething("tester ");
        /*
         * // 目标类2 Subject realSubject2 = new RealSubject2();
         */

        // 多态指向DynamicProxyAOP的接口类InvocationHandler

        // 多态指向DynamicProxyAOP的接口类InvocationHandler
        /* InvocationHandler handler2 = new DynamicProxyAOP(realSubject2); */

        /*
         * Subject subject2 = (Subject) Proxy.newProxyInstance(realSubject2.getClass().getClassLoader(), realSubject2
         * .getClass().getInterfaces(), handler2);
         */

        // subject2.doSomething("tester ");

        String path = "E:/$Proxy0.class";
        byte[] classFile = ProxyGenerator.generateProxyClass("$Proxy0", RealSubject.class.getInterfaces());
        FileOutputStream out = null;
        try {
            out = new FileOutputStream(path);
            out.write(classFile);
            out.flush();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
