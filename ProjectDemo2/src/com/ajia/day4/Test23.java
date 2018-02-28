package com.ajia.day4;

public class Test23 {

	public static void main(String[] args)  {
		try{
           System.out.println(div(8,2));
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public static int div(int a,int b) throws Exception{
		// 定义一个变量来保存值
		int result =0;
		System.out.println("相除开始....");
		try{
		  result = a/b;  // 出现异常的语句
		}catch (Exception e){
			e.printStackTrace();
		}finally{
			System.out.println("除法结束....");
		}
		return result;
	}
}
