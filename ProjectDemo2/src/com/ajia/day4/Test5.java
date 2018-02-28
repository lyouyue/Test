package com.ajia.day4;
// 饿汉式
public class Test5 {
	public static void main(String[] args) {
		// 构造方法私有化了之后就不能直接实例化
		Singlaton  sing = Singlaton.get();
		sing.info();
	}
}
// 1、写一个类
class Singlaton{
	///3、在类中实例化  定义一个属性
	// 4、在属性前面加static
	// 5、学习封装性所有属性都要进行私有化
	//8、为防止属性被更改
    private final static Singlaton SIN= new Singlaton();  
	private Singlaton(){} // 2、把构造方法私有化
	public void info(){
		System.out.println("李维今天懵逼了...");
	}
	// 6、写一个方法来实例化
	// 7、在方法前加static
	public static Singlaton get(){
		return SIN;
	}
}

/**
 *  单例设计模式分为两种
 *  饿汉式：不管在程序是否需要使用此类,此类都要经过实例化
 *  懒汉式：在第一次使用的时候才进行实例化
 */
