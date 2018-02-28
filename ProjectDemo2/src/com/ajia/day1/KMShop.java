package com.ajia.day1;

public class KMShop extends KFCAbstract implements KFC {

	@Override
	public void shutiao() {
        System.out.println("昆明分店的薯条,薯条颜色"+COLOR);
	}
	@Override
	public void hanbao() {
		 System.out.println("昆明分店的汉堡");
	}
	@Override
	public void kele() {
		 System.out.println("昆明分店的可乐");
	}
	@Override
	public void zst() {
		System.out.println("昆明洋芋");
		
	}

	
}
