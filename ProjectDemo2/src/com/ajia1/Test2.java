package com.ajia1;
/**
 * ��̬��
 *  ��̬�Զ���
 *    ��̬һ����Ϊ���в�ͬ����������
 *  ��̬�����������﷽��
 *    1.���� 
 *       ��1��.����������
 *       ��2��.�����ĸ�д
 *    2.��
 *       ���������ת�ͣ� ����    ������� = ����ʵ��; ����ת���Զ����
 *       ���������ת��: ����   ������� =(����)����ʵ��;����ת��ǿ��ת��
 *
 */
class  A{
  public void print(){
	  System.out.println("hello ,-----------A");
  }	
  public void print(int a){
	  System.out.println("���,���Ǵ�������a");
  }
  public void print(double a){
	  System.out.println("���Ǻ�,������ĺ�");
  }
}
// ����

class B extends A{
	public void print(){
		System.out.println("hello,�׽���....");
	}
}
public class Test2 {
	public static void main(String[] args) {
         // ʵ����A��
	/*	A  a = new A();
		a.print();
		a.print(10.0);
		a.print(1);
		*/
		B b = new  B();
		b.print();
		b.print(1);
	}
}
