package com.ajia.day1;

// 工厂设计模式    代理设计模式
// 定义一个抽象类 
public abstract class KFCAbstract {
     // 口味
	 public String  kouwei;
	 
	 public final static String  QJT="39.8元";
	 
	 public abstract void zst();
	 
	 public void zjt(){
		 System.out.println("炸鸡腿。。。");
	 }
	
}
