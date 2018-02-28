package com.ajia1;

/**
 * 多态性
 *   多态一个行为具有不同表现能力。
 *  多态性
 *    方法
 *    类
 *
 */
public class Test8 {
	public static void main(String[] args) {
		Demo1 demo = new Demo3();
		demo.shuchu();
		// 向下转型
		// 子类   子类对象  =（子类）父类的实例化;
		Demo3  demo3 = (Demo3)demo;
		demo3.demo3();
	}
}

class Demo1{
	public void shuchu(){
		System.out.println("父类中方法");
	}
}
class Demo3 extends Demo1{
	public void demo3(){
		System.out.println("demo3特有的方法");
	}
}
