package com.ajia;

// ����һ������
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
	// ���������Ϣ
	public String info() {
		return "������" + name + ",���䣺" + age;
	}
}
