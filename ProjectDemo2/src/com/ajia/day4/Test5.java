package com.ajia.day4;
// ����ʽ
public class Test5 {
	public static void main(String[] args) {
		// ���췽��˽�л���֮��Ͳ���ֱ��ʵ����
		Singlaton  sing = Singlaton.get();
		sing.info();
	}
}
// 1��дһ����
class Singlaton{
	///3��������ʵ����  ����һ������
	// 4��������ǰ���static
	// 5��ѧϰ��װ���������Զ�Ҫ����˽�л�
	//8��Ϊ��ֹ���Ա�����
    private final static Singlaton SIN= new Singlaton();  
	private Singlaton(){} // 2���ѹ��췽��˽�л�
	public void info(){
		System.out.println("��ά�����±���...");
	}
	// 6��дһ��������ʵ����
	// 7���ڷ���ǰ��static
	public static Singlaton get(){
		return SIN;
	}
}

/**
 *  �������ģʽ��Ϊ����
 *  ����ʽ�������ڳ����Ƿ���Ҫʹ�ô���,���඼Ҫ����ʵ����
 *  ����ʽ���ڵ�һ��ʹ�õ�ʱ��Ž���ʵ����
 */
