package com.ajia.day1;
// java.lang.NullPointerException java的空指针异常
/**
 * 产生空指针异常的原因
 * 只进行对象声明,没有进行对象的实例化
 *
 */
public class Test5 {
	public static void main(String[] args) {
        // 向上转型 
		// 定义 
		// public 返回类型 方法名称(参数类型  参数){}
		Fruit  f =Factory.getInstances(args[0]); 
	//	Fruit  f  = ff; null
		// Factory.getInstances(args[0]);  等价于  ff
		//  getInstances ()  返回类型  Fruit 
		// 静态方法  类名称.方法名称()
		//  String[]  
		// 数组名[下标]
		if(f!=null){
			f.eat();
		}
		  // 对象.方法();
	}
}
class Factory{
	// 返回类型是 Fruit
	//Fruit  ff = new Apple();
	Fruit ff =null;
	public static Fruit getInstances(String  a){
		if("Apple".equals(a)){
			return new Apple();
		}else if("Banana".equals(a)){
			return new Banana();
		}else if("Orange".equals(a)){
			return new  Orange();
		}else{
			return null;
		}
	}
}
// 定义水果接口
interface Fruit{
	// 定义一个水果的接口的抽象方法
	void eat();
}
class Apple implements Fruit{
	@Override
	public void eat() {
	   System.out.println("回家吃苹果...");
	}
}
class Banana  implements Fruit{
	@Override
	public void eat() {
		System.out.println("吃香蕉....");
	}
}
class Orange implements Fruit{
	@Override
	public void eat() {
		System.out.println("吃橘子...");
	}
} 
