package com.ajia;

class AA{
	public void print(){
		System.out.println("**********A*********");
	}
}
class BB extends AA{
	public void print(){
		System.out.println("=============B=========");
	}
}

public class Test10 {
	 /**
	  * �����ĸ�д
	  *  ΪʲôҪ�з����ĸ�д��
	  *    �Ȳ���ı丸���з�������,�������丸��Ĺ��ܣ���ʱ��ͳ��ָ�д�ĸ���
	  * �������Ͳ���,�������Ʋ���,�������Ͳ���,������������
	  * �仯���Ƿ������ܸı䡣
	  */
	public static void main(String[] args) {
		BB  b = new BB();
		b.print();
	}

}
