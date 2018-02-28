package com.ajia.day4;

public class Test21 {

	// thorws  
	public static void main(String[] args)  {
		try {
			f();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       /* try {
			fun();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	}
	public static void f() throws Exception{
		fun();
	}
	public static void fun()  throws Exception{
		System.out.println("AAAAAAAAAA");
		System.out.println(10/0);
	}
}
