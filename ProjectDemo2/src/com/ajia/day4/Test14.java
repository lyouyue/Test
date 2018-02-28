package com.ajia.day4;

public class Test14 {
	public static void main(String[] args) {
		Sexs sex = Sexs.get(Sexs.NVS);
		System.out.println(sex);
	}
}

class Sexs {
	public final static String  NANS="男人";
	public final static String  NVS="女人";
	// 方法的定义
	private final static Sexs NAN = new Sexs("男");
	private final static Sexs NV = new Sexs("女");
	// public 返回类型 方法(参数类型 参数 ){}
	private String title; // 定义一个属性
	private Sexs(String t) { // 定义一个构造方法
		this.title = t;
	}
	public static Sexs get(String  a){
		if("男人".equals(a)){
			return NAN;
		}else{
			return NV;
		}
	}
	// 覆写Object中方法
	public String  toString(){
		return this.title;
	}
}