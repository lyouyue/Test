package com.ajia.day4;

public class Test26 {

	public static void main(String[] args) {
		//Persong per = new Studentss("����",15,12312);
		Persong  pers = new Persong("����",12);
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
		return "����:"+name+",����:"+age;
	}
}
class Studentss extends Persong{
	private int number; // ����ѧ��ѧ��
	public Studentss(String  name ,int age ,int number){
		super(name,age);
		this.number=number;
	}
	public void fun(){
		System.out.println("hello world");
	}
}
