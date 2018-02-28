package com.ajia1;
/**
 * 多态性
 *  多态性定义
 *    多态一个行为具有不同表现能力。
 *  多态型体现在哪里方法
 *    1.方法 
 *       （1）.方法的重载
 *       （2）.方法的覆写
 *    2.类
 *       对象的向上转型： 父类    父类对象 = 子类实例; 向上转型自动完成
 *       对象的向下转型: 子类   子类对象 =(子类)父类实例;向下转型强制转型
 *
 */
class  A{
  public void print(){
	  System.out.println("hello ,-----------A");
  }	
  public void print(int a){
	  System.out.println("你好,我是带参数的a");
  }
  public void print(double a){
	  System.out.println("你们好,才是真的好");
  }
}
// 父类

class B extends A{
	public void print(){
		System.out.println("hello,套近乎....");
	}
}
public class Test2 {
	public static void main(String[] args) {
         // 实例化A类
	/*	A  a = new A();
		a.print();
		a.print(10.0);
		a.print(1);
		*/
		B b = new  B();
		b.print();
		b.print(1);
	}
}
