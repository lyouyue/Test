package com.ajia.day4;

// ����
public class Test12 {
	public static void main(String[] args) {
       Sex sex = Sex.get(Sex.BAOMIS);
       System.out.println(sex);
	}
}
class Sex {
	public final static int NANS =1;  // ��һ������  1��ʾ������
	public final static int NVS=2;  // ����һ������ 2��ʾһ��Ů
	public final static int BAOMIS=3 ; // ����һ������ 3��ʾ���Ǳ���
	// ʵ����һ������
	private final static  Sex  NAN = new Sex("��");
	private final static  Sex  NV = new Sex("Ů");
	private final static  Sex  BAOMI = new Sex("����");
	// ��  Ů   ����
	private String  title; // ����һ������
	private Sex( String title){  // ���췽��˽�л�
		this.title=title; // ��ʵ������ʱ����и�ֵ
	}
	// ��дObject��toString����
	public String toString(){
		return this.title; // ����title 
	}
	// ͨ��������ʵ����
	public static Sex get(int a){
		switch(a){
		   case 1:
			   return NAN;
		   case 2:
			   return NV;
		   case 3:
			   return BAOMI;
		   default :
			   return null;
		}
	}
}


