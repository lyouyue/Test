package com.ajia1;

public class Test5 {
	public static void main(String[] args) {
		// ����ת��
		// ����  �������  = ����ʵ����;
		AA  a= new BB(); //����ת��  �Զ����
		//aa.print();
		// ��ô����������ķ���
		// ����  ������� = (����) ����ʵ����;
		//AA aa = new AA();  // ʵ����һ���������
		BB  bb = (BB)a; // ����ת��  ǿ��ת��
		bb.printBB();
	}
}
class AA{
	public void print(){
		System.out.println("-----------AA--------");
	}
}
class  BB extends AA{
	public void print(){
		System.out.println("-----BB-----");
	}
	public void printBB(){
		System.out.println("******BB*****");
	}
}
