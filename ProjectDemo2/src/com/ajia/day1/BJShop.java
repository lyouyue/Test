package com.ajia.day1;

public class BJShop extends KFCAbstract implements KFC {
	@Override
	public void shutiao() {
		 System.out.println("�����ֵ������,������ɫ"+COLOR);

	}
	@Override
	public void hanbao() {
		 System.out.println("�����ֵ�ĺ���");
	}
	@Override
	public void kele() {
		 System.out.println("�����ֵ�Ŀ���");
	}
	@Override
	public void zst() {
		System.out.println("ը����...");
		
	}
}
