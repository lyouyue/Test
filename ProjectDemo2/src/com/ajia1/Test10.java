package com.ajia1;

public class Test10 {
	public static void main(String[] args) {
      // �������ܲ���ʵ����
	   // ����ת��
		Demo5  demo5 = new Demo6();
		demo5.chen();
		demo5.jichen();
		// ����ת��
		Demo6  demo6 = (Demo6)demo5;
		demo6.pig();
	}
}
// ������һ��������
abstract class Demo5{
	public int number; // ������һ������
	public final static double PI =3.1415926; // ������һ������ 
	public void print(){  
	  //number2 = number2+1;
	  // PI = PI +1;
	} // ������һ������
	// Ϊʲô���첻�ܼ�abstract������ͨ��������
	public Demo5(){
	} // ���幹�췽��
	// ����һ�����󷽷�  ,���󷽷�û�з�����
	public abstract void chen();
	public abstract void jichen();
}

//<<�ڿ͵۹�>>
class  Demo6 extends Demo5{
	 //����̳��˳����࣬��ô����Ҫ��д����ȫ�����󷽷�
	@Override  // annotation ע��  // Overloading  ����
	public void chen() {
		 System.out.println("��ʦ�ֽ��챻����");
	}
	@Override 
	public void jichen() {
		System.out.println("ɳʦ�ܣ�������");
	}
	// �����Լ��еķ���
	public void pig(){
		System.out.println("��ʦ�֣���ʦ��ȥ�����ˣ�");
	}
}

