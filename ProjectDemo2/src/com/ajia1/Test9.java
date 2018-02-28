package com.ajia1;

public class Test9 {

	/**
	 * 抽象类定义和抽象类的使用 
	 * abstract 
	 * adj.抽象的 
	 * v.抽象化 
	 * n.摘要,梗概;抽象艺术作品;抽象的东西;理论思考
	 * 定义一个抽象类  
	 *  abstract class 类名称{
	 *  }
	 *  定义一个抽象方法
	 *    public abstract 返回类型  方法名称 
	 *    (参数类型  参数);
	 * abstract 关键字
	 *   定义类的前面
	 *   定义方法返回值前面
	 *   abstract 方法的前面 没有方法实现体 {}
	 * 定义抽象类的意义
	 *   1、为子类提供一个公共的类型
	 *   2、封装子类中重复的内容（属性和方法）
	 *   3、定义抽象方法,在子类中有不同的实现,
	 *   但是方法名称是一致的。
	 *  抽象类需要子类去实现，抽象需要继承
	 * 
	 * 
	 * 
	 */
	public static void main(String[] args) {
	}
}
// Demo4 是一个抽象类
abstract class Demo4{
	/* public int num;*/
	public abstract  void print();
}
