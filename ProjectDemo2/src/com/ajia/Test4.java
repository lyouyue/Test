package com.ajia;

public class Test4 {
   
	/**
	 * main 主方法 ,程序的入口
	 * public（共有的，公共的） 修饰符 是控制方法的访问权限
	 * static : 静态方法 ，全局数据区
	 * void ：方法的返回类型,什么不返回
	 * main： 方法名称
	 * String[]： 参数类型  字符串的数组
	 * args：参数
	 * configuration :配置
	 */
	public static void main(String[] a) {
		for(int i=0;i<a.length;i++){
			//输出参数
			System.out.println(a[i]);
		}
	}

}
