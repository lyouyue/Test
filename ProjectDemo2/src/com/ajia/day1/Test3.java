package com.ajia.day1;

public class Test3 {

	//  һ�����༴�̳г�������ʵ�ֽӿ�
	// class ����   extends ������   implements �ӿ�{} 
	
	/**
	 * �ܽ�
	 * 1���ӿڱ����˵��̳У�һ���������ʵ�ֶ���ӿ�
	 * 2���ӿڵ�ʵ��һ������һ������,ͨ��implements ��ʵ�ֽӿڡ�
	 * 3���ӿ��з���ȫ���ǳ��󷽷�,ȫ�ֳ����Ķ�����Բ���static��
	 * 4���ӿ�Ҫʵ�ֱ���Ҫ���࣬ͨ������ת����ʵ�ֽӿ�ʵ������
	 * 
	 * �����нӿڵ�ʹ��ԭ��
	 * 1����ʾ����һ�ֲ�����׼�͹���
	 * 2����ʾ����һ������
	 * 3�����������˵�Զ�̷����ṩ�ͻ���
	 * 
	 */
	public static void main(String[] args) {
		KMShop km = new  KMShop();
		km.zst();
		
		KFCAbstract  kfcs = new KMShop();
		kfcs.zjt();
	
		/*String ss=KFC.COLOR;*/ //��̬���������Ե���
		// ��.����  ��.����()
		System.out.println(KFC.COLOR);
		System.out.println();
		

	}

}
