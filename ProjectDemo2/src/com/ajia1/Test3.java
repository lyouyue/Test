package com.ajia1;

public class Test3 {
	public static void main(String[] args) {
		fun(new Student());
		//fun(new Teacher());
		fun(new Worker());
	    // 实例化一个对象 new Worker() 开辟一个内存空间
	}
	// 声明对象 Student a 
	/*public static void fun(Student a){
		a.eat();
	   	a.xuexi();
	}
	public static void fun(Teacher a){
	   	a.jiaoxue();
	   	a.eat();
	}
	public static void fun(Worker a){
	   	a.eat();
	   	a.work();
	}*/
	public static void fun(Person a){
	   	a.eat();
	  // a.work();
	   	if(a instanceof Student){
	   		Student stu = (Student)a;
	   		stu.xuexi();
	   	}
	   	if(a instanceof Teacher){
	   		Teacher ter = (Teacher)a;
	   		ter.jiaoxue();
	   	}
	   	if(a instanceof Worker){
	   		Worker wo = (Worker)a;
	   		wo.work();
	   	}
	}
}


class Person{
	public void eat(){
		System.out.println("吃饭.....");
	}
}

class Student extends Person{
	public void eat(){
		System.out.println("学生在吃饭...");
	}
	public void xuexi(){
		System.out.println("学习....");
	}
}

class Teacher extends Person{
	public void eat(){
		System.out.println("教师在吃饭");
	}
	
	public  void jiaoxue(){
		System.out.println("教师正在上课....");
	}
}

class Worker extends Person{
	public void eat(){
		System.out.println("工人在吃饭");
	}
	
	public  void work(){
		System.out.println("工人正在搬砖....");
	}
}



