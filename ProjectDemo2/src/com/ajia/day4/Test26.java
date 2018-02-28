package com.ajia.day4;

public class Test26 {

	public static void main(String[] args) {
		//Persong per = new Studentss("张三",15,12312);
		Persong  pers = new Persong("王五",12);
		Studentss  ss = (Studentss)pers;
		ss.fun();
	}
}
class Persong{
	private String name ;
	private int age;
	public Persong(String n ,int a){
		this.name=n;
		this.age=a;
	}
	public String toString(){
		return "姓名:"+name+",年龄:"+age;
	}
}
class Studentss extends Persong{
	private int number; // 定义学生学号
	public Studentss(String  name ,int age ,int number){
		super(name,age);
		this.number=number;
	}
	public void fun(){
		System.out.println("hello world");
	}
}
