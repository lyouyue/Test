package com.ajia.day1;

public class Test10 {

	public static void main(String[] args) {
     // add(12,45);
		System.out.println(add(12,45));
		// Object  
		// double 
	//	add(12.5,12.5);
	// 	add(2,5.5);
	}
	
	/*public static void add(Object a ,Object b){
		System.out.println(+b);
	}*/
	
/*	public static void print(String  a){
		System.out.println(a);
	}
	
	public static void print(String[]  a){
		System.out.println(a);
	}
	
	public static void print(Object  a){
		System.out.println(a);
	}*/
	public static Object add(double a ,double b){
		return a+b;
	}

	public static Object add(int a ,double b){
		return a+b;
	}
	
	public static Object add(float a ,double b){
		return a+b;
	}
	
	// ����Ȩ��
	// ��
	
	/**
	 * �ܽ�
	 *   �ӿڶ��弰�ӿڵ�ʹ��
	 *   interface  �ӿ���{}
	 *   �ӿڵ�ʹ��1
	 *   class ����  implements �ӿ���{
	 *   }
	 *   �ӿ�ʹ�ö�
	 *   class ���� implements �ӿ�1,�ӿ�2,....{}
	 *   �ӿ���
	 *   class ����  extends ��(������) implements �ӿ�{
	 *  }
	 *   
	 *   �ӿڵ�ʹ�ù���
	 *   1���ӿڱ�ʾ����һ�ֱ�׼
	 *   2���ӿڱ�ʾ����һ������
	 *   3����ʾ�ķ���˵�Զ����ͼ�������ݿͻ���
	 *   
	 * �ӿ��ܽ�
	 * 1���ӿڱ����˵��̳У�һ���������ʵ�ֶ���ӿ�
	 * 2���ӿڵ�ʵ��һ������һ������,ͨ��implements ��ʵ�ֽӿڡ�
	 * 3���ӿ��з���ȫ���ǳ��󷽷�,ȫ�ֳ����Ķ�����Բ���static��
	 * 4���ӿ�Ҫʵ�ֱ���Ҫ���࣬ͨ������ת����ʵ�ֽӿ�ʵ������
	 * 
	 * �������ģʽ ����
	 * 
	 * github
	 * 
	 * Object ��
	 *   ΪʲôҪʹ��Object��
	 *   Object�����еĸ���
	 *   
	 *   public String toString();
	 * 
	 */
}
