package com.ajia1;

/**
 *   �������ܽ�
 *   1�������಻�ܱ�ʵ����,���Ҫʵ������Ҫ������̳С�
 *   ͨ������ת��ȥʵ��ʵ����
 *   2���������п���û�г��󷽷�,���ǳ��󷽷������ڳ�
 *   �����С�
 *   3���������еĳ��󷽷�û����ʵ��,ֻ�Ƕ�����һ��
 *   ��������
 *   4�����췽��,��static ���εĵط����ܳ���abstract
 *   �����Ρ�
 *   5����������ȫ��������ͨ������ȫ����д��
 *   
 *   һ��IT ��˾ �г���Ա����Ŀ����
 *   ����Ա�������������䣬����
 *   ��Ϊ������
 *   ��Ŀ���� �������� �����䣬����,����
 *   ��Ϊ:����
 *   
 *   
 */
public class Test11 {

	public static void main(String[] args) {
        // ����Ϸ
		// ��Ƭ
		// ����
		// д����
		Computer  com = new  DaShiXiong();
		com.writeCode();
		DaShiXiong  dsx = (DaShiXiong)com;
		dsx.luguan();
	}
}

abstract class Computer{
	//����Ϸ
	public abstract void play();
	// ��Ƭ
	public abstract void lookAV();
	// ����
	public abstract void work();
	// д����
	public abstract void writeCode();
}

class DaShiXiong extends Computer{
	@Override
	public void play() {
	    System.out.println("��ʦ���ں���������Ϸ");
	}
	@Override
	public void lookAV() {
		System.out.println("��ʦ����ѧϰ����ʦ�Ķ���");
	}
	@Override
	public void work() {
		System.out.println("��ʦ�ּ�װ�ڹ���");
	}
	@Override
	public void writeCode() {
		//System.out.println("��ʦ����ߣ����");
	}
	public  void  luguan(){
		System.out.println("��ʦ����˽�˰�����...");
	}
}

class XiaoTiao extends Computer{

	@Override
	public void play() {
		 System.out.println("С���ںͺ�������Ϸ");
	}

	@Override
	public void lookAV() {
		 System.out.println("���ؿ�ζ��Ƭ...");
	}

	@Override
	public void work() {
		 System.out.println("С�﹤������...");
	}

	@Override
	public void writeCode() {
		 System.out.println("С����д����...");
	}
	
	public void momo(){
		System.out.println("��İİ������");
	}
	
}

abstract class GG{
	public  GG(){}
	public  abstract  int add();
}
abstract class JJ extends GG{
	
}