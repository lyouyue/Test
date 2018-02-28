package com.ajia1;

public class Test10 {
	public static void main(String[] args) {
      // 抽象类能不能实例化
	   // 向上转型
		Demo5  demo5 = new Demo6();
		demo5.chen();
		demo5.jichen();
		// 向下转型
		Demo6  demo6 = (Demo6)demo5;
		demo6.pig();
	}
}
// 定义了一个抽象类
abstract class Demo5{
	public int number; // 定义了一个属性
	public final static double PI =3.1415926; // 定义了一个常量 
	public void print(){  
	  //number2 = number2+1;
	  // PI = PI +1;
	} // 定义了一个方法
	// 为什么构造不能加abstract，而普通方法可以
	public Demo5(){
	} // 定义构造方法
	// 定义一个抽象方法  ,抽象方法没有方法体
	public abstract void chen();
	public abstract void jichen();
}

//<<黑客帝国>>
class  Demo6 extends Demo5{
	 //子类继承了抽象类，那么必须要覆写父类全部抽象方法
	@Override  // annotation 注解  // Overloading  重载
	public void chen() {
		 System.out.println("大师兄今天被罚了");
	}
	@Override 
	public void jichen() {
		System.out.println("沙师弟，吃了吗？");
	}
	// 子类自己有的方法
	public void pig(){
		System.out.println("大师兄：二师兄去哪里了？");
	}
}

