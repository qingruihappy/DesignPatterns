package com.DesignPatterns.ar.Bridge2;
/**
 * 
 * @author qingruihappy
 * @data   2018年11月7日 下午11:42:55
 * @说明:狂野的美女
 */
public class WildGift extends Gift {
	public WildGift(GiftImpl giftImpl) {
		this.impl = giftImpl;
	}
	@Override
	public void woshi(MM mm) {
		System.out.println("我是:"+mm.getName()+",一位狂野的女生");
		impl.GiftImpl();
	}
}
