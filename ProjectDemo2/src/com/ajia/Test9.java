package com.ajia;

class A{
	public A(){
		System.out.println("AAAAAAAAAAAAAAAAA");
	}
}
class B extends A{
	public B(){
		System.out.println("BBBBBBBBBBBBBBBBBB");
	}
}
class C extends B {
	public C(){
		System.out.println("CCCCCCCC");
	
	}
}

public class Test9 {

	 /**
	  * 
	  * �̳е�����
	  * 1.һ������ֻ�ܼ̳�һ������,һ����������ж������
	  * 2.�����ǲ��ܼ̳и���˽�����Ժͷ�����
	  * 3.��ʵ������������ʱ����ʵ��������
	  */
	public static void main(String[] args) {
		C  c = new C();
	}

}
