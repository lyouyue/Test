package com.ajia1;

public class Test5 {
	public static void main(String[] args) {
		// 向上转型
		// 父类  父类对象  = 子类实例化;
		AA  a= new BB(); //向上转型  自动完成
		//aa.print();
		// 怎么来调用子类的方法
		// 子类  子类对象 = (子类) 父类实例化;
		//AA aa = new AA();  // 实例化一个父类对象
		BB  bb = (BB)a; // 向下转型  强制转换
		bb.printBB();
	}
}
class AA{
	public void print(){
		System.out.println("-----------AA--------");
	}
}
class  BB extends AA{
	public void print(){
		System.out.println("-----BB-----");
	}
	public void printBB(){
		System.out.println("******BB*****");
	}
}
