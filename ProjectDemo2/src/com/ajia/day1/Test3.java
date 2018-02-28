package com.ajia.day1;

public class Test3 {

	//  一个子类即继承抽象类又实现接口
	// class 子类   extends 抽象类   implements 接口{} 
	
	/**
	 * 总结
	 * 1、接口避免了单继承，一个子类可以实现多个接口
	 * 2、接口的实现一定定义一个子类,通过implements 来实现接口。
	 * 3、接口中方法全部是抽象方法,全局常量的定义可以不加static。
	 * 4、接口要实现必须要子类，通过向上转型来实现接口实例化。
	 * 
	 * 开发中接口的使用原则
	 * 1、表示的是一种操作标准和规则
	 * 2、表示的是一种能力
	 * 3、将服务器端的远程方法提供客户端
	 * 
	 */
	public static void main(String[] args) {
		KMShop km = new  KMShop();
		km.zst();
		
		KFCAbstract  kfcs = new KMShop();
		kfcs.zjt();
	
		/*String ss=KFC.COLOR;*/ //静态方法或属性调用
		// 类.属性  类.方法()
		System.out.println(KFC.COLOR);
		System.out.println();
		

	}

}
