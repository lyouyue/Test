package com.ajia.day4;

public class Test17 {

	/**
	 *  �쳣
	 *  try {
	 *     // Ҫִ�еĴ���  ����Ҫ�����쳣�����
	 *  }catch(�쳣����  ����){
	 *     // ������쳣���
	 *  } 
	 *  
	 *   try{
	 *      // ���Գ����쳣�����
	 *   }catch(�쳣����  ����){
	 *      // �����쳣�����
	 *   }finally{
	 *      // ���ܲ����쳣���Ҫִ�е����
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
