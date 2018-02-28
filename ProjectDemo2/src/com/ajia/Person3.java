package com.ajia;

// 定义一个人类
public class Person3 {
	public String name; // 
	public int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	// 输出人类信息
	public String info() {
		return "姓名：" + name + ",年龄：" + age;
	}
}
