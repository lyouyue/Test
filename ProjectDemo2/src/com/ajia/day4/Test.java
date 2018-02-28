package com.ajia.day4;
// 调用工厂
public class Test {
	public static void main(String[] args) {
		Fruit  f = Factory.get(args[0]);
		if(f!=null){
			f.eat();
		}
	}
}
// 写出一个接口 
interface Fruit{
	void eat();
}
// 实现接口
class Apple implements Fruit{
	@Override
	public void eat() {
         System.out.println("吃苹果");		
	}
}
class Orange implements Fruit{
	@Override
	public void eat() {
        System.out.println("吃橘子...");		
	}
}
// 3.实例化上面子类
class Factory{
	public static Fruit get(String  a){
		if("Apple".equals(a)){
			return new Apple();
		}else if("Orange".equals(a)){
			return new  Orange();
		}else{
			return null;
		}
	}
}