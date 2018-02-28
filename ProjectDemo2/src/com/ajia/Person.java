package com.ajia;

public class Person {
	public String name;
	public int age;
	/**
	 * String 字符串 =(赋值) ==(等于)
	 */
	// 定义一个人类国家
	public static String country;
   // 光标放在属性上面--->右键--->
   // soruce--->getters and setters
	// 获取国家属性
	public static String getCountry() {
		return country;
	}
    // 为国家属性设置值
	public static void setCountry(String country) {
		Person.country = country;
	}

	/**
	 * 定义一个方法返回人类信息
	 * 
	 * @return
	 */
	public String info() {
		return "姓名：" + name + ",年龄：" + age + ",国家：" + country;
	}

	/**
	 * 定义一个构造方法为人类复制姓名和年龄
	 * 
	 * @param n
	 * @param a
	 */
	public Person(String n, int a) {
		name = n;
		age = a;
	}

}
