package com.ajia.day4;

public class Test19 {

	public static void main(String[] args) {
      // 定义变量
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
		 *  Error:在程序还没有执行的出现错误,JVM(java虚拟机)产生错误,用户无法处理
		 *  Exception:程序运行的异常,该异常是可以处理的
		 */
	}
}
