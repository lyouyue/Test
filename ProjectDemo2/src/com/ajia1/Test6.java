package com.ajia1;

public class Test6 {

	public static void main(String[] args) {
         // fun(new AA1());
         // fun(new BB1());
         fun(new CC());
          
         // ����  ������� = ����ʵ����; 
          // AA1  a = new BB1();
	}
	public static void fun(AA1 a){
		a.print(); // ���ø���ķ���
		if(a instanceof BB1){ // �ж�ʵ�����Ƿ���BB1 
			//�����ʵ������
			// ����ת��  
			//  ����  ������� =(����)�����ʵ����;
			BB1 b =(BB1)a;  // ����ת��
			b.printBB(); // �����������з���
		}
		if(a instanceof CC){
			CC c = (CC)a;
			c.printCC();
		}
	}
	
	/*public static void fun(BB1 b){
		b.print();
		b.printBB();
	}
	public static void fun(CC c){
		c.print();
		c.printCC();
	}*/
}
class AA1{
	public void print(){
		System.out.println("----AA1---");
	}
}
class BB1 extends AA1{
	public void print(){
		System.out.println("----BB1---");
	}
	public void printBB(){
		System.out.println("-----BBB1----");
	}
}
class CC extends AA1{
	public void print(){
		System.out.println("----CC---");
	}
	public void printCC(){
		System.out.println("----CC���еķ���---");
	}
}

