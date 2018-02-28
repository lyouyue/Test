package com.ajia;

public class Test2 {
    // static 学习一下static 这个关键字
	// static 修饰属性
	// static 修饰方法
	public static void main(String[] args) {
		 //实例化四个对象
		// 调用后面的构造方法为其赋值
         Person perA= new Person("张三",23);
         Person perB= new Person("李四",24);
         Person perC= new Person("王五",45);
         Person perD= new Person("赵六",78);
       //  Person.country="秦朝";
         Person.setCountry("大汉王朝");
       //    perB.country="陈朝";
         // 对象名称.方法名称();
         System.out.println(perA.info());
         System.out.println(perB.info());
         System.out.println(perC.info());
         System.out.println(perD.info());
         // 通过static修饰的属性和方法，不存储在内存的堆和栈中
         // static修饰的属性和方法，全局数据区
         // System.arraycopy()
         // static 修饰属性和方法不要通过new来实例化
         // static 修饰的属性和方法的调用是通过
         // 类名称.属性  或者 类名称.方法();
       
        
	}
	
	/*public  void prints(){
		System.out.println("你们这是要造反啊！");
	}*/

}
