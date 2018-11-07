package com.DesignPatterns.al.Dynamic92;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;

public class TestClone {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
        Constructor<DynamicProxyAOP > constructor = DynamicProxyAOP.class.getConstructor();
        System.out.println(constructor);
        Subject realSubject = new RealSubject();
        InvocationHandler handler = new DynamicProxyAOP(realSubject);
        DynamicProxyAOP emp3 = constructor.newInstance(new Object[] {
                handler
            });
    }
}
