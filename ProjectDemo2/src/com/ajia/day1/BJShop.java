package com.ajia.day1;

public class BJShop extends KFCAbstract implements KFC {
	@Override
	public void shutiao() {
		 System.out.println("北京分店的薯条,薯条颜色"+COLOR);

	}
	@Override
	public void hanbao() {
		 System.out.println("北京分店的汉堡");
	}
	@Override
	public void kele() {
		 System.out.println("北京分店的可乐");
	}
	@Override
	public void zst() {
		System.out.println("炸洋芋...");
		
	}
}
