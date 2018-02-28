package com.ajia.day4;

public class Test11 {

	/*
	 * switch(参数[int char String]){
	 *   case 参数:
	 *      执行语句
	 *      break;
	 *   case  参数:
	 *      执行的语句
	 *      break;
	 *   ...
	 *   default:
	 *      break;
	 * }
	 */
	public static void main(String[] args) {
	//	fun('a');
		fun1(2);
		
	}
	// for while do{} while();
	public static void fun(char a){
		switch (a){
		  case 'a':
			  System.out.println("今天是个好天气...");
			  break;
		  case 'b':
			  System.out.println("今天小田大喜之日...");
			  break;
		  case 'c':
			  System.out.println("陈云的大喜之日...");
			  break;
		  default:
		      System.out.println("李维的大喜之日...");
		      break;
		}
	}
	public static void fun1(int a){
		if(a==1){
			 System.out.println("今天是个好天气...");
		}else if(a==2){
			System.out.println("今天小田大喜之日...");
		}else if(a==3){
			System.out.println("陈云的大喜之日...");
		}else{
			 System.out.println("李维的大喜之日...");
		}
	}
}
