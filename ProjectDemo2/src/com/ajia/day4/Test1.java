package com.ajia.day4;
public class Test1 {
	/**
	 *  git 
	 *  
	 *  接口
	 *  为什么要定义接口
	 *   1、少写代码 ,
	 *  定义接口
	 *  interface  接口{
	 *  }
	 *  接口的实现
	 *  class 子类  implements 接口{
	 *  }
	 *  实现多个接口
	 *  class 子类  implements 接口1,接口2,...{
	 *  }
	 *  
	 *  class 子类 extends 抽象类  implements 接口1,接口2,...{
	 *  
	 *  }
	 *  接口使用规则
	 *  1、接口表示一种标准
	 *  2、接口表示一种能力
	 *  3、将服务器端视图方法传递给远程的客户端
	 *  
	 *  工厂设计默认
	 *    
	 *   各种 权限5 小田   
	 *  总结抽象类和接口的区别
	 *    区别                抽象类             接口
	 *    1、关键字        abstract     interface
	 *    2、访问权限    可以使用各种权限   只能public
	 *    3、 子类实现   抽闲类一个子类只能继承一个父类 单继承。extends
	 *                一个类可以实现多个接口 ，implements
	 *    4、组成      属性、常量、方法 、构造方法、抽象方法              抽象方法 、常量
	 *    5、对象实例化   都是通过子类向上转型
	 *    6、设计模式     模板设计模式     工厂设计模式  代理设计模式
	 *    7、 操作局限     单继承             多现实,没有继承的局限性
	 *    
	 *    抽象类的定义
	 *    abstract class 类名称{
	 *    }
	 *    抽象类的继承
	 *      class 子类 extends 父类{}
	 *    抽象类怎么实现
	 *        向上转型：
	 *           父类  对象 = new 子类();
	 *       向下转型
	 *         子类  对象 = (子类) 父类对象;
	 *    抽象类的规则
	 *        
	 *    static
	 *        
	 *    final
	 *    this 
	 *    封装
	 *    继承
	 *    多态性
	 *    构造方法
	 *    方法重载和覆写
	 *    数组
	 *    java数据类型
	 *    方法定义
	 *    for循环
	 *    while 
	 *    do {}while();
	 *    if()
	 *    if()else{}
	 *    break
	 *    continue
	 */
	public static void main(String[] args) {
        C c = new C();
        c.print();
        c.fun();
	}
}
interface A{
	void print();
}
interface D {
	void fun1();
}
interface B extends A,D{
	void fun();
}
class C implements B{
	@Override
	public void print() {
		System.out.println("AAAAAAAAAA");
	}
	@Override
	public void fun() {
       System.out.println("BBBBBBBBB");		
	}
	@Override
	public void fun1() {
	}	
}
abstract class F{
}