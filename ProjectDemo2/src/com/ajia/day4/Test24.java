package com.ajia.day4;

public class Test24 {
   // java.lang.RuntimeException
	public static void main(String[] args) {
		/*try{*/
		int num = Integer.parseInt(args[0]); // ����String����ת��Ϊint����
	     System.out.println(num*num); //NumberFormatException
		/*}catch(Exception e){
			e.printStackTrace();
		}*/
	     /**
	      *  RuntimeException��Exception
	      *  1��RuntimeException ��Exception ���ࡣ
	      *  2��ֻҪ��RuntimeException������,��Ҫǿ���ԵĽ����쳣�Ĵ���,
	      *  ����������쳣,������쳣����java���������
	      *  3������������RuntimeException�����࣬
	      *   ArithmeticException(�����쳣)
	      *   ClassCastException(��ת���쳣)��
	      *    IndexOutOfBoundsException(����Խ���쳣)
	      *   NullPointerException(��ָ���쳣)
	      */
	}
}
