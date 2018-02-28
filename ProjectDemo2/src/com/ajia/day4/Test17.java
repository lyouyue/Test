package com.ajia.day4;

public class Test17 {

	/**
	 *  异常
	 *  try {
	 *     // 要执行的代码  可以要出现异常的语句
	 *  }catch(异常类型  参数){
	 *     // 处理的异常语句
	 *  } 
	 *  
	 *   try{
	 *      // 可以出现异常的语句
	 *   }catch(异常类型  参数){
	 *      // 处理异常的语句
	 *   }finally{
	 *      // 不管产生异常与否都要执行的语句
	 *   }
	 */
	public static void main(String[] args) {
		
		System.out.println("AAAAAAAAAAAAAAAAAAAA");
		try{
		  System.out.println(10/0);
		}catch(ArithmeticException e){
			e.printStackTrace();
			/*System.out.println(e);*/
		}finally {
			
		}
		/**
		 * Exception in thread "main" java.lang.ArithmeticException: / by zero
         * at Test.main(Test.java:4)
		 */
		System.out.println("CCCCCCCCCCCCCCCCCCCCCC");
	}

}
