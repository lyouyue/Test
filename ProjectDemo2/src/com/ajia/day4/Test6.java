package com.ajia.day4;

public class Test6 {

	public static void main(String[] args) {
		Singlatons sing =Singlatons.get();
		sing.info();
	}
}
//1��дһ����
class Singlatons{
	///3��������ʵ����  ����һ������
	// 4��������ǰ���static
	// 5��ѧϰ��װ���������Զ�Ҫ����˽�л�
	//8��Ϊ��ֹ���Ա�����
    private  static Singlatons SIN=null;  
	private Singlatons(){} // 2���ѹ��췽��˽�л�
	public void info(){
		System.out.println("��ά�����±���...");
	}
	// 6��дһ��������ʵ����
	// 7���ڷ���ǰ��static
	public static Singlatons get(){
		if(SIN==null){ 
			SIN= new  Singlatons();
		}
		return SIN;
	}
}