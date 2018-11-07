package com.DesignPatterns.al.Dynamic91;

public class Client {
	public static void main(String[] args) throws Exception {
		UserMgr mgr = new UserMgrImpl();
		InvocationHandler h = new TransactionHandler(mgr);
		UserMgr u = (UserMgr)Proxy.newProxyInstance(UserMgr.class,h);
		u.addUser();
	}
}
