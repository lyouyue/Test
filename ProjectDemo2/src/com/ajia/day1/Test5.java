package com.ajia.day1;
// java.lang.NullPointerException java�Ŀ�ָ���쳣
/**
 * ������ָ���쳣��ԭ��
 * ֻ���ж�������,û�н��ж����ʵ����
 *
 */
public class Test5 {
	public static void main(String[] args) {
        // ����ת�� 
		// ���� 
		// public �������� ��������(��������  ����){}
		Fruit  f =Factory.getInstances(args[0]); 
	//	Fruit  f  = ff; null
		// Factory.getInstances(args[0]);  �ȼ���  ff
		//  getInstances ()  ��������  Fruit 
		// ��̬����  ������.��������()
		//  String[]  
		// ������[�±�]
		if(f!=null){
			f.eat();
		}
		  // ����.����();
	}
}
class Factory{
	// ���������� Fruit
	//Fruit  ff = new Apple();
	Fruit ff =null;
	public static Fruit getInstances(String  a){
		if("Apple".equals(a)){
			return new Apple();
		}else if("Banana".equals(a)){
			return new Banana();
		}else if("Orange".equals(a)){
			return new  Orange();
		}else{
			return null;
		}
	}
}
// ����ˮ���ӿ�
interface Fruit{
	// ����һ��ˮ���Ľӿڵĳ��󷽷�
	void eat();
}
class Apple implements Fruit{
	@Override
	public void eat() {
	   System.out.println("�ؼҳ�ƻ��...");
	}
}
class Banana  implements Fruit{
	@Override
	public void eat() {
		System.out.println("���㽶....");
	}
}
class Orange implements Fruit{
	@Override
	public void eat() {
		System.out.println("������...");
	}
} 
