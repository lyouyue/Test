package com.ajia.day1;

public class Test8 {
    // Object 类
	// Object 类是所有引用数据类型的父类
	// 接口  数组  抽象类  类
	// 定义一个Person
	public static void main(String[] args) {
       // 向上转型
		/*Object obj = new Person("张三",45);
		// 向下转型
		Person  per = (Person) obj;
		System.out.println(per.info());
		
		// 向上转型
		
		Object objs =args;
		// 
		Object objss = new CC();
		*/
		// 为什么要定义Object类
		// 向上转型能体现出类的多态性
		// Object 类中的方法  
		// public String toString()
		
		Person per  =new Person("张三",15);
	   // System.out.println(per); // com.ajia.day1.Person@7fbe847c
	    
	    System.out.println(per.toString());	
	}
}
interface BB{
}
class CC implements BB{
}
class Person extends Object{
	public String name ;
	public int age ;
	// 输出人类的信息
	public String  info(){
		return "姓名："+name+"，年龄："+age;
	}
	public Person(String  name ,int age){
		this.name=name;
		this.age=age;
	}
	//覆写Object类中toString()方法
	public String toString(){
		return "姓名："+name+"，年龄："+age;
	}

	
}
