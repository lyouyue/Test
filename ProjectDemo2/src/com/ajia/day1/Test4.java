package com.ajia.day1;

/**
 * Ϊʲô˵�ӿ��в��������Ժͷ���
 * 
 *
 */
public class Test4 {

	public static void main(String[] args) {
       DD d = new DD();
       d.number=12;
       d.setNumber(13);
	}

}
// �������ģʽ
interface AA{
	//public int number ;
	// ����ӿ�������
	//  ����.���� 
	// �ӿ��ǲ���ֱ��ʵ����
	// ͨ������ȥ�޸����� 
	// �ӿ������г��󷽷�
	// �ӿ��Ƕ����Ժ���Ϊ��һ�ָ��߲�εĳ���
}

class DD{
	int number ;
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
}

// ����.����=ֵ
// ͨ������ȥ�޸�����