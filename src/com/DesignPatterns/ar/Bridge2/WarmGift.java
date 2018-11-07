package com.DesignPatterns.ar.Bridge2;
/**
 * 
 * @author qingruihappy
 * @data   2018年11月7日 下午11:42:31
 * @说明:温柔的美女
 */
public class WarmGift extends Gift{
	public WarmGift(GiftImpl impl) {
		this.impl = impl;
	}
	


	@Override
	public void woshi(MM mm) {
		System.out.println("我是:"+mm.getName()+",一位温柔的女生");	
		impl.GiftImpl();
	}
}
