package com.ajia.day4;

public class Test14 {
	public static void main(String[] args) {
		Sexs sex = Sexs.get(Sexs.NVS);
		System.out.println(sex);
	}
}

class Sexs {
	public final static String  NANS="����";
	public final static String  NVS="Ů��";
	// �����Ķ���
	private final static Sexs NAN = new Sexs("��");
	private final static Sexs NV = new Sexs("Ů");
	// public �������� ����(�������� ���� ){}
	private String title; // ����һ������
	private Sexs(String t) { // ����һ�����췽��
		this.title = t;
	}
	public static Sexs get(String  a){
		if("����".equals(a)){
			return NAN;
		}else{
			return NV;
		}
	}
	// ��дObject�з���
	public String  toString(){
		return this.title;
	}
}