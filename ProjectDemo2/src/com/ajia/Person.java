package com.ajia;

public class Person {
	public String name;
	public int age;
	/**
	 * String �ַ��� =(��ֵ) ==(����)
	 */
	// ����һ���������
	public static String country;
   // ��������������--->�Ҽ�--->
   // soruce--->getters and setters
	// ��ȡ��������
	public static String getCountry() {
		return country;
	}
    // Ϊ������������ֵ
	public static void setCountry(String country) {
		Person.country = country;
	}

	/**
	 * ����һ����������������Ϣ
	 * 
	 * @return
	 */
	public String info() {
		return "������" + name + ",���䣺" + age + ",���ң�" + country;
	}

	/**
	 * ����һ�����췽��Ϊ���ิ������������
	 * 
	 * @param n
	 * @param a
	 */
	public Person(String n, int a) {
		name = n;
		age = a;
	}

}
