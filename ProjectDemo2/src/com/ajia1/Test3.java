package com.ajia1;

public class Test3 {
	public static void main(String[] args) {
		fun(new Student());
		//fun(new Teacher());
		fun(new Worker());
	    // ʵ����һ������ new Worker() ����һ���ڴ�ռ�
	}
	// �������� Student a 
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
		System.out.println("�Է�.....");
	}
}

class Student extends Person{
	public void eat(){
		System.out.println("ѧ���ڳԷ�...");
	}
	public void xuexi(){
		System.out.println("ѧϰ....");
	}
}

class Teacher extends Person{
	public void eat(){
		System.out.println("��ʦ�ڳԷ�");
	}
	
	public  void jiaoxue(){
		System.out.println("��ʦ�����Ͽ�....");
	}
}

class Worker extends Person{
	public void eat(){
		System.out.println("�����ڳԷ�");
	}
	
	public  void work(){
		System.out.println("�������ڰ�ש....");
	}
}



