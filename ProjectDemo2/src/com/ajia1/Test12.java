package com.ajia1;

/**
 * Employee 
 * programmer 
 * manager
 * һ��IT��˾�г���Ա����Ŀ����
 *   ����Ա�������������䣬����
 *   ��Ϊ������
 *   ��Ŀ���� �������� �����䣬����
 *   ��Ϊ:���� ,��ȡ����
 *
 */
abstract class Empolyee{
	public String name ;  // �����Ա������
	public int age; // �����Ա������
	public int number; // �����Ա�Ĺ���
	// �����Ա����
	abstract void working();

	//public void eat(){}
}

class Programer extends Empolyee{
	@Override
	void working() {
		System.out.println("����Ա��д����....");
	}
}

class Manager extends Empolyee{
    public void money(){
    	System.out.println("��Ŀ�����ȡ���𡣡���");
    }
	@Override
	void working() {
		System.out.println("��Ŀ���������������....");
	}
	
} 
public class Test12 {

	public static void main(String[] args) {
        Empolyee em= new Programer();
        em.working();
        // ����ת��
        Empolyee em1 = new  Manager();
        em1.working();
        //����ת��
        Manager mger = (Manager)em1;
        mger.money();
	}

}
