package com.ajia.day1;

public class Test10 {

	public static void main(String[] args) {
     // add(12,45);
		System.out.println(add(12,45));
		// Object  
		// double 
	//	add(12.5,12.5);
	// 	add(2,5.5);
	}
	
	/*public static void add(Object a ,Object b){
		System.out.println(+b);
	}*/
	
/*	public static void print(String  a){
		System.out.println(a);
	}
	
	public static void print(String[]  a){
		System.out.println(a);
	}
	
	public static void print(Object  a){
		System.out.println(a);
	}*/
	public static Object add(double a ,double b){
		return a+b;
	}

	public static Object add(int a ,double b){
		return a+b;
	}
	
	public static Object add(float a ,double b){
		return a+b;
	}
	
	// 访问权限
	// 包
	
	/**
	 * 总结
	 *   接口定义及接口的使用
	 *   interface  接口名{}
	 *   接口的使用1
	 *   class 子类  implements 接口名{
	 *   }
	 *   接口使用二
	 *   class 子类 implements 接口1,接口2,....{}
	 *   接口三
	 *   class 子类  extends 类(抽象类) implements 接口{
	 *  }
	 *   
	 *   接口的使用规则
	 *   1、接口表示的是一种标准
	 *   2、接口表示的是一种能力
	 *   3、表示的服务端的远程视图方法传递客户端
	 *   
	 * 接口总结
	 * 1、接口避免了单继承，一个子类可以实现多个接口
	 * 2、接口的实现一定定义一个子类,通过implements 来实现接口。
	 * 3、接口中方法全部是抽象方法,全局常量的定义可以不加static。
	 * 4、接口要实现必须要子类，通过向上转型来实现接口实例化。
	 * 
	 * 工厂设计模式 案例
	 * 
	 * github
	 * 
	 * Object 类
	 *   为什么要使用Object类
	 *   Object是所有的父类
	 *   
	 *   public String toString();
	 * 
	 */
}
