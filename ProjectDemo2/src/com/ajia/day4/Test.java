package com.ajia.day4;
// ���ù���
public class Test {
	public static void main(String[] args) {
		Fruit  f = Factory.get(args[0]);
		if(f!=null){
			f.eat();
		}
	}
}
// д��һ���ӿ� 
interface Fruit{
	void eat();
}
// ʵ�ֽӿ�
class Apple implements Fruit{
	@Override
	public void eat() {
         System.out.println("��ƻ��");		
	}
}
class Orange implements Fruit{
	@Override
	public void eat() {
        System.out.println("������...");		
	}
}
// 3.ʵ������������
class Factory{
	public static Fruit get(String  a){
		if("Apple".equals(a)){
			return new Apple();
		}else if("Orange".equals(a)){
			return new  Orange();
		}else{
			return null;
		}
	}
}