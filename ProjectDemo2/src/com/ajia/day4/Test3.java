package com.ajia.day4;

public class Test3 {
	/**
	 *  单例设计模式
	 *  
	 */
	public static void main(String[] args) {
       //  Singlate  sing = new Singlate();
       //  sing.info();
		Singlate sing = null;
		sing=Singlate.getInstance();
		//java.lang.NullPointerException
		// 空指针异常原因是只进行了对象的声明，没有在堆中开辟空间
		sing.info();
		Singlate  singA = Singlate.getInstance();
		Singlate  singB = Singlate.getInstance();
		Singlate  singC = Singlate.getInstance();
		System.out.println(sing);
		System.out.println(singA);  // Singlate@7fbe847c
		System.out.println(singB);  // Singlate@7fbe847c
		System.out.println(singC);  // Singlate@7fbe847c
		// 封装性的时候所有属性都私有化
		// static 属性和方法不要进行实例化，类名称.属性 类名称.方法
	}
}
class Singlate{
    private final static Singlate  INSTANCE = new  Singlate();
	private Singlate(){} // 把构造私有化了
	public void info(){
		System.out.println("hello");
	}
	// 通过方法来实例化
	public static Singlate getInstance(){
		return INSTANCE;
	}
}
