package com.ajia;

//extends ��չ 
public class Students extends Person3 {
	/*public String name;
	public int age;*/
    public int number; // ������ѧ�����ѧ��
	/*public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}*/
	/*public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}*/

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String info() {
		return "������" + name + ",���䣺" + age+",ѧ�ţ�"+number;
	}
}
