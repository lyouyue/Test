package com.ajia.day1;

public class Test1 {
	public  static int NUMBER=124;
     /**
      * ���̬��
      *  ����
      *  
      *  ��̬��
      *   ����
      *     1������������
      *        ��ͬһ�����У�����������ͬ��
      *        �������ͣ����������������������͡�
      *     2�������ĸ�д
      *        ����̳и��࣬����������ͬ������������ͬ������������ͬ������������ͬ
      *        ����ִ�еĹ��ܲ�ͬ��
      *   ��
      *     ����ת��(�Զ����)
      *       ����   ������� = ����ʵ����;
      *     ����ת��
      *       ����   ������� = (����)�������; 
      * 
      * ΪʲôҪʹ�ó�����
      *   1��
      *   ������
      *     abstract class ������{
      *     }
      *    ���巽��
      *     public abstracat  ��������  ��������(��������  ���� ...);
      * 
      * �̳ж���
      *  class ����  extends ����{
      *  }
      *  
      *  �ӿ���һ�ֹ���ͱ�׼
      *  
      *  �ӿ���ô����
      *   interface  �ӿ����� {
      *       // ����
      *       // ���󷽷�
      *   }
      * Ӧ�ýӿ�
      *  ����  implements  �ӿ���{}
      *  // ʵ��ʵ����
      *  �ӿ�   ����   = new ����();  // ����ת��
      *  
      */
	public static void main(String[] args) {
       USB  usb = new DELL();
       usb.start();
       usb.end();
      //  ����ת��
       DELL dell = (DELL) usb;
       dell.play();
       
       //  
       USB usb1 = new Lenovo();
       usb1.start();
       usb1.end();
       
       Lenovo  len = (Lenovo) usb1;
       len.zhiwen();
       
	}
}

/**
 *���췽��
 *   ������������������ͬ, �޷������ͣ�
 *   
 * @author Ajia
 *
 */
interface USB{
    // ����
	// ���󷽷�
	// �������ʽ
	// ������USB�ӿ�ȫ�ֳ���  
	public final static String COLOR="��ɫ";
	// ������һ�����󷽷�
	public  abstract void start(); //  
	public abstract void end();  //
	
}
class DELL implements USB{
	@Override
	public void start() {
		System.out.println("DELL��USB��ʼ����");
	}
	@Override
	public void end() {
		System.out.println("DELL��USBֹͣ����");
	}
	public void play(){
		System.out.println("DELL����Ϸ����ʮ��");
	}
}
class Lenovo implements  USB{
	@Override
	public void start() {
		System.out.println("Lenovo��USB��ʼ����");
	}
	@Override
	public void end() {
		System.out.println("Lenovo��USBֹͣ����");
	}
	public void zhiwen(){
		System.out.println("Lenovoָ�ƽ���");
	}
}

