package com.ajia.day1;

// ΪʲôҪ����Object��
// ����ת�������ֳ���Ķ�̬�� ,ʵ�ֲ�����ͳһ
public class Test9 {

	public static void main(String[] args) {
        AC ac = new BC();
        Object obj = ac ;
        BC bc = (BC)obj;
        bc.printBC();
	}
	
	
}
//  ������һ���ӿ�
interface AC {
	void print();
}
class BC implements AC{
	@Override
	public void print() {
		System.out.println("-------BC------");
	}
	
	public void printBC(){
		System.out.println("=======BCBC");
	}
}
class VC implements AC{
	@Override
	public void print() {
		System.out.println("-----VC------");
	}
}
