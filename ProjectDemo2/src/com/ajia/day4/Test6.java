package com.ajia.day4;

public class Test6 {

	public static void main(String[] args) {
		Singlatons sing =Singlatons.get();
		sing.info();
	}
}
//1、写一个类
class Singlatons{
	///3、在类中实例化  定义一个属性
	// 4、在属性前面加static
	// 5、学习封装性所有属性都要进行私有化
	//8、为防止属性被更改
    private  static Singlatons SIN=null;  
	private Singlatons(){} // 2、把构造方法私有化
	public void info(){
		System.out.println("李维今天懵逼了...");
	}
	// 6、写一个方法来实例化
	// 7、在方法前加static
	public static Singlatons get(){
		if(SIN==null){ 
			SIN= new  Singlatons();
		}
		return SIN;
	}
}