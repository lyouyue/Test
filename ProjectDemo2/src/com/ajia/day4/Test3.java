package com.ajia.day4;

public class Test3 {
	/**
	 *  �������ģʽ
	 *  
	 */
	public static void main(String[] args) {
       //  Singlate  sing = new Singlate();
       //  sing.info();
		Singlate sing = null;
		sing=Singlate.getInstance();
		//java.lang.NullPointerException
		// ��ָ���쳣ԭ����ֻ�����˶����������û���ڶ��п��ٿռ�
		sing.info();
		Singlate  singA = Singlate.getInstance();
		Singlate  singB = Singlate.getInstance();
		Singlate  singC = Singlate.getInstance();
		System.out.println(sing);
		System.out.println(singA);  // Singlate@7fbe847c
		System.out.println(singB);  // Singlate@7fbe847c
		System.out.println(singC);  // Singlate@7fbe847c
		// ��װ�Ե�ʱ���������Զ�˽�л�
		// static ���Ժͷ�����Ҫ����ʵ������������.���� ������.����
	}
}
class Singlate{
    private final static Singlate  INSTANCE = new  Singlate();
	private Singlate(){} // �ѹ���˽�л���
	public void info(){
		System.out.println("hello");
	}
	// ͨ��������ʵ����
	public static Singlate getInstance(){
		return INSTANCE;
	}
}
