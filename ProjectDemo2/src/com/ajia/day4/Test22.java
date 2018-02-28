package com.ajia.day4;

public class Test22 {
    //   throw
	public static void main(String[] args) {
       try {
			throw new Exception("你好！"); // 这个有异常
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/**
	 * throws throw 有什么区别
	 * throw :在方法体使用,表示的是一个手工抛出异常。
	 * throws :在方法的定义中使用,表示我们在调用该方法的时候要进行异常处理。
	 */
}
