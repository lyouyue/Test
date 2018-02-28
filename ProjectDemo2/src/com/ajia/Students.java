package com.ajia;

//extends 扩展 
public class Students extends Person3 {
	/*public String name;
	public int age;*/
    public int number; // 定义了学生类的学号
	/*public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}*/
	/*public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}*/

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String info() {
		return "姓名：" + name + ",年龄：" + age+",学号："+number;
	}
}
