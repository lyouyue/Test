package com.ajia.day4;

public class Test11 {

	/*
	 * switch(����[int char String]){
	 *   case ����:
	 *      ִ�����
	 *      break;
	 *   case  ����:
	 *      ִ�е����
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
			  System.out.println("�����Ǹ�������...");
			  break;
		  case 'b':
			  System.out.println("����С���ϲ֮��...");
			  break;
		  case 'c':
			  System.out.println("���ƵĴ�ϲ֮��...");
			  break;
		  default:
		      System.out.println("��ά�Ĵ�ϲ֮��...");
		      break;
		}
	}
	public static void fun1(int a){
		if(a==1){
			 System.out.println("�����Ǹ�������...");
		}else if(a==2){
			System.out.println("����С���ϲ֮��...");
		}else if(a==3){
			System.out.println("���ƵĴ�ϲ֮��...");
		}else{
			 System.out.println("��ά�Ĵ�ϲ֮��...");
		}
	}
}
