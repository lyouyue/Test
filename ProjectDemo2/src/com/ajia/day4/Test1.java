package com.ajia.day4;
public class Test1 {
	/**
	 *  git 
	 *  
	 *  �ӿ�
	 *  ΪʲôҪ����ӿ�
	 *   1����д���� ,
	 *  ����ӿ�
	 *  interface  �ӿ�{
	 *  }
	 *  �ӿڵ�ʵ��
	 *  class ����  implements �ӿ�{
	 *  }
	 *  ʵ�ֶ���ӿ�
	 *  class ����  implements �ӿ�1,�ӿ�2,...{
	 *  }
	 *  
	 *  class ���� extends ������  implements �ӿ�1,�ӿ�2,...{
	 *  
	 *  }
	 *  �ӿ�ʹ�ù���
	 *  1���ӿڱ�ʾһ�ֱ�׼
	 *  2���ӿڱ�ʾһ������
	 *  3��������������ͼ�������ݸ�Զ�̵Ŀͻ���
	 *  
	 *  �������Ĭ��
	 *    
	 *   ���� Ȩ��5 С��   
	 *  �ܽ������ͽӿڵ�����
	 *    ����                ������             �ӿ�
	 *    1���ؼ���        abstract     interface
	 *    2������Ȩ��    ����ʹ�ø���Ȩ��   ֻ��public
	 *    3�� ����ʵ��   ������һ������ֻ�ܼ̳�һ������ ���̳С�extends
	 *                һ�������ʵ�ֶ���ӿ� ��implements
	 *    4�����      ���ԡ����������� �����췽�������󷽷�              ���󷽷� ������
	 *    5������ʵ����   ����ͨ����������ת��
	 *    6�����ģʽ     ģ�����ģʽ     �������ģʽ  �������ģʽ
	 *    7�� ��������     ���̳�             ����ʵ,û�м̳еľ�����
	 *    
	 *    ������Ķ���
	 *    abstract class ������{
	 *    }
	 *    ������ļ̳�
	 *      class ���� extends ����{}
	 *    ��������ôʵ��
	 *        ����ת�ͣ�
	 *           ����  ���� = new ����();
	 *       ����ת��
	 *         ����  ���� = (����) �������;
	 *    ������Ĺ���
	 *        
	 *    static
	 *        
	 *    final
	 *    this 
	 *    ��װ
	 *    �̳�
	 *    ��̬��
	 *    ���췽��
	 *    �������غ͸�д
	 *    ����
	 *    java��������
	 *    ��������
	 *    forѭ��
	 *    while 
	 *    do {}while();
	 *    if()
	 *    if()else{}
	 *    break
	 *    continue
	 */
	public static void main(String[] args) {
        C c = new C();
        c.print();
        c.fun();
	}
}
interface A{
	void print();
}
interface D {
	void fun1();
}
interface B extends A,D{
	void fun();
}
class C implements B{
	@Override
	public void print() {
		System.out.println("AAAAAAAAAA");
	}
	@Override
	public void fun() {
       System.out.println("BBBBBBBBB");		
	}
	@Override
	public void fun1() {
	}	
}
abstract class F{
}