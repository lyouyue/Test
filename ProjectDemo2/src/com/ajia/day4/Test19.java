package com.ajia.day4;

public class Test19 {

	public static void main(String[] args) {
      // �������
		try{
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			System.out.println(a/b);
	/*	}catch(ArrayIndexOutOfBoundsException e){
			e.printStackTrace();
		}catch (ArithmeticException  e){
			e.printStackTrace();
		}catch(NumberFormatException e){
			e.printStackTrace();
		}*/
		}
		catch(Exception e){
			e.printStackTrace();
		}
		finally{
			System.out.println("BBBBBBBBB");
		}
		/**
		 *  Throwable 
		 *  Error:�ڳ���û��ִ�еĳ��ִ���,JVM(java�����)��������,�û��޷�����
		 *  Exception:�������е��쳣,���쳣�ǿ��Դ����
		 */
	}
}
