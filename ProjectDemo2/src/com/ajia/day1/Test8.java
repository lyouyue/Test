package com.ajia.day1;

public class Test8 {
    // Object ��
	// Object �������������������͵ĸ���
	// �ӿ�  ����  ������  ��
	// ����һ��Person
	public static void main(String[] args) {
       // ����ת��
		/*Object obj = new Person("����",45);
		// ����ת��
		Person  per = (Person) obj;
		System.out.println(per.info());
		
		// ����ת��
		
		Object objs =args;
		// 
		Object objss = new CC();
		*/
		// ΪʲôҪ����Object��
		// ����ת�������ֳ���Ķ�̬��
		// Object ���еķ���  
		// public String toString()
		
		Person per  =new Person("����",15);
	   // System.out.println(per); // com.ajia.day1.Person@7fbe847c
	    
	    System.out.println(per.toString());	
	}
}
interface BB{
}
class CC implements BB{
}
class Person extends Object{
	public String name ;
	public int age ;
	// ����������Ϣ
	public String  info(){
		return "������"+name+"�����䣺"+age;
	}
	public Person(String  name ,int age){
		this.name=name;
		this.age=age;
	}
	//��дObject����toString()����
	public String toString(){
		return "������"+name+"�����䣺"+age;
	}

	
}
