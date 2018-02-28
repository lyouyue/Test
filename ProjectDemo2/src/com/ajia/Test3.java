package com.ajia;

public class Test3 {

	public static void main(String[] args) {
		Person.setCountry("大清");
		System.out.println(Person.getCountry());
	}

	public static void prints(){
		
		System.out.println("小心隔壁老王");
	}
	
	public void prints1(){
		prints();
		System.out.println("正在和你媳妇聊天");
	}
	/**
	 * 结论：
	 * 非static 修饰的方法可以条用static修饰的方法和属性
	 * static修饰的方法，不可以调用非static修饰的属性和方法
	 * 
	 */
}
