package com.ajia.day1;
 // ����д��һ���������ģʽ�ʹ���Ĭ�ϵİ���
public class Test7 {

	public static void main(String[] args) {
		Fruits ss =Factroy.get(args[0]) ;
		//Object  obj =Factroy.get(args[0]) ;
		if(ss!=null){
			ss.eat();
		}
	}
}
// ��һ�� ������һ���ӿ�
interface Fruits{
	void eat();
}
// �ڶ�����д�����������ֱ�ʵ�ֶ���Ľӿ�
class Apples implements Fruits{
	@Override
	public void eat() {
		System.out.println("��ƻ��...");
	}
}

class Bananer implements Fruits{
	@Override
	public void eat() {
		System.out.println("���㽶...");
	}
}

// ������: ����һ������  ��������Ŀ����Ϊ�������ʵ����
class Factroy{
	public static Fruits  get(String  arg){
		//  Fruits ff = new  Apples();  // ����ת��
		if("Apples".equals(arg)){
			return new  Apples();
		}else if("Bananer".equals(arg)){
			return new Bananer();
		}else{
			return null;
		}
	} 
}