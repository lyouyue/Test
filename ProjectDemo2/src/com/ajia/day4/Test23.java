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
		// ����һ������������ֵ
		int result =0;
		System.out.println("�����ʼ....");
		try{
		  result = a/b;  // �����쳣�����
		}catch (Exception e){
			e.printStackTrace();
		}finally{
			System.out.println("��������....");
		}
		return result;
	}
}
