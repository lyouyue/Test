package com.ajia;

public class Test3 {

	public static void main(String[] args) {
		Person.setCountry("����");
		System.out.println(Person.getCountry());
	}

	public static void prints(){
		
		System.out.println("С�ĸ�������");
	}
	
	public void prints1(){
		prints();
		System.out.println("���ں���ϱ������");
	}
	/**
	 * ���ۣ�
	 * ��static ���εķ�����������static���εķ���������
	 * static���εķ����������Ե��÷�static���ε����Ժͷ���
	 * 
	 */
}
