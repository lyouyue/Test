package com.ajia1;

/**
 * ��̬��
 *   ��̬һ����Ϊ���в�ͬ����������
 *  ��̬��
 *    ����
 *    ��
 *
 */
public class Test8 {
	public static void main(String[] args) {
		Demo1 demo = new Demo3();
		demo.shuchu();
		// ����ת��
		// ����   �������  =�����ࣩ�����ʵ����;
		Demo3  demo3 = (Demo3)demo;
		demo3.demo3();
	}
}

class Demo1{
	public void shuchu(){
		System.out.println("�����з���");
	}
}
class Demo3 extends Demo1{
	public void demo3(){
		System.out.println("demo3���еķ���");
	}
}
