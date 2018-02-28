package com.ajia;
class AA1{
	//private >缺省 > public
	// final 最后的，不可修改的
	 void print(){
		System.out.println("**********A*********");
	}
}
class BB1 extends AA1{
	public void print(){
		System.out.println("=============B=========");
	}
}
/**
 * 子类要覆写父类的方法，子类修饰权限不能高于父类
 */
public class Test11 {
	public static void main(String[] args) {
		BB1  b = new BB1();
		b.print();
	}
}
