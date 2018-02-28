package com.ajia.day4;

// 多例
public class Test12 {
	public static void main(String[] args) {
       Sex sex = Sex.get(Sex.BAOMIS);
       System.out.println(sex);
	}
}
class Sex {
	public final static int NANS =1;  // 定一个常量  1表示的是男
	public final static int NVS=2;  // 定义一个常量 2表示一个女
	public final static int BAOMIS=3 ; // 定义一个常量 3表示的是保密
	// 实例化一个对象
	private final static  Sex  NAN = new Sex("男");
	private final static  Sex  NV = new Sex("女");
	private final static  Sex  BAOMI = new Sex("保密");
	// 男  女   保密
	private String  title; // 定义一个属性
	private Sex( String title){  // 构造方法私有化
		this.title=title; // 在实例化的时候进行赋值
	}
	// 覆写Object中toString方法
	public String toString(){
		return this.title; // 返回title 
	}
	// 通过外面类实例化
	public static Sex get(int a){
		switch(a){
		   case 1:
			   return NAN;
		   case 2:
			   return NV;
		   case 3:
			   return BAOMI;
		   default :
			   return null;
		}
	}
}


