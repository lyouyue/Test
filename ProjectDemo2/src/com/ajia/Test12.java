package com.ajia;

/*final class DD {
	
}*/

class DD {
	// 通过final 修饰的常量，常量名称所有的字母都要大写
	 final double PI =3.1415926;
	 public  void modifier(){
		 System.out.println("这是一个final修饰的方法");
	 }
}
class FF extends DD{
	 public final void modifier(){
		 System.out.println("这是一个final修饰的方法");
	 }
}
public class Test12 {
	/** 
	 * final  最后的,不可以修改的   太监
	 * 北京  中关村 
	 * 太监官名   中官
	 * final 修饰类  final修饰的类是不能够实现继承的
	 * final 修饰的属性   final修饰的属性是一个常量，常量是不能够修改的
	 * final 修饰的方法   final修饰的方法不能实现覆写
	 */
	public static void main(String[] args) {
      
	}

}
