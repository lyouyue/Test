package com.ajia.day4;
public class Test7 {
	public static void main(String[] args) {
		Singleton1  sin = Singleton1.get();
		sin.fun();
		// ����.����  ����.����()
	}
}
class Singleton1{
	// ������ʵ����
    private final static Singleton1 INSTACE = new Singleton1(); 
	private Singleton1(){} // ���췽��˽�л�
	public void fun(){
		System.out.println("hello world!");
	}
	public static Singleton1 get(){
		return INSTACE;
	}
}
