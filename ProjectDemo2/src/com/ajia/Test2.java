package com.ajia;

public class Test2 {
    // static ѧϰһ��static ����ؼ���
	// static ��������
	// static ���η���
	public static void main(String[] args) {
		 //ʵ�����ĸ�����
		// ���ú���Ĺ��췽��Ϊ�丳ֵ
         Person perA= new Person("����",23);
         Person perB= new Person("����",24);
         Person perC= new Person("����",45);
         Person perD= new Person("����",78);
       //  Person.country="�س�";
         Person.setCountry("������");
       //    perB.country="�³�";
         // ��������.��������();
         System.out.println(perA.info());
         System.out.println(perB.info());
         System.out.println(perC.info());
         System.out.println(perD.info());
         // ͨ��static���ε����Ժͷ��������洢���ڴ�ĶѺ�ջ��
         // static���ε����Ժͷ�����ȫ��������
         // System.arraycopy()
         // static �������Ժͷ�����Ҫͨ��new��ʵ����
         // static ���ε����Ժͷ����ĵ�����ͨ��
         // ������.����  ���� ������.����();
       
        
	}
	
	/*public  void prints(){
		System.out.println("��������Ҫ�췴����");
	}*/

}
