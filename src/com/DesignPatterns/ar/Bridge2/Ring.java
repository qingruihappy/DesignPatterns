package com.DesignPatterns.ar.Bridge2;
/**
 * 
 * @author qingruihappy
 * @data   2018年11月7日 下午11:41:33
 * @说明:戒指礼物
 */
public class Ring extends GiftImpl {
	public Ring() {
	}
	
	@Override
	public void GiftImpl() {
		System.out.println("我要的是戒指");
		
	}
}
