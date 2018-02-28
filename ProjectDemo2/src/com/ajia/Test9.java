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
	  * 继承的限制
	  * 1.一个子类只能继承一个父类,一个父类可以有多个子类
	  * 2.子类是不能继承父类私有属性和方法的
	  * 3.在实例化对象对象的时候，先实例化父类
	  */
	public static void main(String[] args) {
		C  c = new C();
	}

}
