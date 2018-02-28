package com.ajia.day4;
public class Test7 {
	public static void main(String[] args) {
		Singleton1  sin = Singleton1.get();
		sin.fun();
		// 对象.属性  对象.方法()
	}
}
class Singleton1{
	// 在类中实例化
    private final static Singleton1 INSTACE = new Singleton1(); 
	private Singleton1(){} // 构造方法私有化
	public void fun(){
		System.out.println("hello world!");
	}
	public static Singleton1 get(){
		return INSTACE;
	}
}
