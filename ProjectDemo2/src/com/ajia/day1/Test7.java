package com.ajia.day1;
 // 请你写出一个工厂设计模式和代理默认的案例
public class Test7 {

	public static void main(String[] args) {
		Fruits ss =Factroy.get(args[0]) ;
		//Object  obj =Factroy.get(args[0]) ;
		if(ss!=null){
			ss.eat();
		}
	}
}
// 第一步 ：定义一个接口
interface Fruits{
	void eat();
}
// 第二步：写两个子类来分别实现定义的接口
class Apples implements Fruits{
	@Override
	public void eat() {
		System.out.println("吃苹果...");
	}
}

class Bananer implements Fruits{
	@Override
	public void eat() {
		System.out.println("吃香蕉...");
	}
}

// 第三步: 定义一个工厂  ，工厂的目的是为子类进行实例化
class Factroy{
	public static Fruits  get(String  arg){
		//  Fruits ff = new  Apples();  // 向上转型
		if("Apples".equals(arg)){
			return new  Apples();
		}else if("Bananer".equals(arg)){
			return new Bananer();
		}else{
			return null;
		}
	} 
}