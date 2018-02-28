package com.ajia.day1;

/**
 * 为什么说接口中不能有属性和方法
 * 
 *
 */
public class Test4 {

	public static void main(String[] args) {
       DD d = new DD();
       d.number=12;
       d.setNumber(13);
	}

}
// 工厂设计模式
interface AA{
	//public int number ;
	// 假设接口有属性
	//  对象.属性 
	// 接口是不能直接实例化
	// 通过方法去修改属性 
	// 接口中所有抽象方法
	// 接口是对属性和行为的一种更高层次的抽象
}

class DD{
	int number ;
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
}

// 对象.属性=值
// 通过方法去修改属性