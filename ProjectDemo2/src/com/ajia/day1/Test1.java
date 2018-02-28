package com.ajia.day1;

public class Test1 {
	public  static int NUMBER=124;
     /**
      * 类多态性
      *  定义
      *  
      *  多态性
      *   方法
      *     1、方法的重载
      *        在同一个类中，方法名称相同，
      *        参数类型，参数个数，参数返回类型。
      *     2、方法的覆写
      *        子类继承父类，参数类型相同，参数个数相同，方法名称相同，返回类型相同
      *        方法执行的功能不同。
      *   类
      *     向上转型(自动完成)
      *       父类   父类对象 = 子类实例化;
      *     向下转型
      *       子类   子类对象 = (子类)父类对象; 
      * 
      * 为什么要使用抽象类
      *   1、
      *   定义类
      *     abstract class 类名称{
      *     }
      *    定义方法
      *     public abstracat  返回类型  方法名称(参数类型  参数 ...);
      * 
      * 继承定义
      *  class 子类  extends 父类{
      *  }
      *  
      *  接口是一种规则和标准
      *  
      *  接口怎么定义
      *   interface  接口名称 {
      *       // 常量
      *       // 抽象方法
      *   }
      * 应用接口
      *  子类  implements  接口名{}
      *  // 实现实例化
      *  接口   对象   = new 子类();  // 向上转型
      *  
      */
	public static void main(String[] args) {
       USB  usb = new DELL();
       usb.start();
       usb.end();
      //  向下转型
       DELL dell = (DELL) usb;
       dell.play();
       
       //  
       USB usb1 = new Lenovo();
       usb1.start();
       usb1.end();
       
       Lenovo  len = (Lenovo) usb1;
       len.zhiwen();
       
	}
}

/**
 *构造方法
 *   方法名称与类名称相同, 无返回类型，
 *   
 * @author Ajia
 *
 */
interface USB{
    // 常量
	// 抽象方法
	// 函数表达式
	// 定义了USB接口全局常量  
	public final static String COLOR="黑色";
	// 定义了一个抽象方法
	public  abstract void start(); //  
	public abstract void end();  //
	
}
class DELL implements USB{
	@Override
	public void start() {
		System.out.println("DELL的USB开始工作");
	}
	@Override
	public void end() {
		System.out.println("DELL的USB停止工作");
	}
	public void play(){
		System.out.println("DELL打游戏体验十足");
	}
}
class Lenovo implements  USB{
	@Override
	public void start() {
		System.out.println("Lenovo的USB开始工作");
	}
	@Override
	public void end() {
		System.out.println("Lenovo的USB停止工作");
	}
	public void zhiwen(){
		System.out.println("Lenovo指纹解锁");
	}
}

