package com.ajia;
class AA1{
	//private >ȱʡ > public
	// final ���ģ������޸ĵ�
	 void print(){
		System.out.println("**********A*********");
	}
}
class BB1 extends AA1{
	public void print(){
		System.out.println("=============B=========");
	}
}
/**
 * ����Ҫ��д����ķ�������������Ȩ�޲��ܸ��ڸ���
 */
public class Test11 {
	public static void main(String[] args) {
		BB1  b = new BB1();
		b.print();
	}
}
