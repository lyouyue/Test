package com.ajia.day1;

/**
 * �ӿڵĶ�ʵ��
 *    ����  implements  �ӿ�1,�ӿ�2,....{
 *    
 *    }
 * 
 * ����  ʵ�ֽӿ� ,�ּ̳г����� 
 *
 */
interface A{
	//��A�ӿ��ж�����һ�����󷽷�
	public abstract void print();
}
interface B{
	public  abstract void info();
}

class C implements A ,B{
	@Override
	public void info() {
		System.out.println("hello��Ů����");
	}

	@Override
	public void print() {
		System.out.println("��������������Ҫ��Ҫ");
	}
	
}
public class Test2 {
	public static void main(String[] args) {
        C  c = new C();  // ֱ��ʵ���� 
        c.info();
        c.print();
        
        A a = new C();
        a.print();
        
        B b = new C();
        b.info();
	}

}
