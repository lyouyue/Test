package com.ajia;

class AA{
	public void print(){
		System.out.println("**********A*********");
	}
}
class BB extends AA{
	public void print(){
		System.out.println("=============B=========");
	}
}

public class Test10 {
	 /**
	  * 方法的覆写
	  *  为什么要有方法的覆写？
	  *    既不想改变父类中方法名称,又想扩充父类的功能，这时候就出现覆写的概念
	  * 返回类型不变,方法名称不变,参数类型不变,参数个数不变
	  * 变化的是方法功能改变。
	  */
	public static void main(String[] args) {
		BB  b = new BB();
		b.print();
	}

}
