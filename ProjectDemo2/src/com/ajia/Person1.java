package com.ajia;

public class Person1 {
   static int count; // 定义一个静态属性来存储值
   // 每实例化一次，就调用构造方法一次
   public Person1(){
	   System.out.println("实例化的次数："+ count++);
   }
}
