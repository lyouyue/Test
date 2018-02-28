package com.ajia1;

public class Test6 {

	public static void main(String[] args) {
         // fun(new AA1());
         // fun(new BB1());
         fun(new CC());
          
         // 父类  父类对象 = 子类实例化; 
          // AA1  a = new BB1();
	}
	public static void fun(AA1 a){
		a.print(); // 调用父类的方法
		if(a instanceof BB1){ // 判断实例化是否是BB1 
			//这个类实例化的
			// 向下转型  
			//  子类  子类对象 =(子类)父类的实例化;
			BB1 b =(BB1)a;  // 向下转型
			b.printBB(); // 调用子类特有方法
		}
		if(a instanceof CC){
			CC c = (CC)a;
			c.printCC();
		}
	}
	
	/*public static void fun(BB1 b){
		b.print();
		b.printBB();
	}
	public static void fun(CC c){
		c.print();
		c.printCC();
	}*/
}
class AA1{
	public void print(){
		System.out.println("----AA1---");
	}
}
class BB1 extends AA1{
	public void print(){
		System.out.println("----BB1---");
	}
	public void printBB(){
		System.out.println("-----BBB1----");
	}
}
class CC extends AA1{
	public void print(){
		System.out.println("----CC---");
	}
	public void printCC(){
		System.out.println("----CC独有的方法---");
	}
}

