package com.ajia;

import java.util.Arrays;

public  class Test1 {

	public static void main(String[] args) {
		// Arrays ����Ĺ�����
		// ����ֻ�����ԣ���Ա������ �ͷ��������췽������ͨ������
		// Field Summary ��ͨ��Ա����
		// Constructor Summary ���췽��
		//Method Summary  ��ͨ����
		/**
		 * �ǰ������е�ת���ַ���������
		 * public static String toString(����)
		 * static ���εķ�������
		 * ������.��������();
		 * Arrays.toString();
		 */
		// ������һ���ַ�������
		char  data[] = new char[]{'��','��','��','��','��','��','��'};
        System.out.println(Arrays.toString(data));
        /**
         * �������鵽ָ�����鳤����
         * original  Ҫ���Ƶ�����
         * newLength  ָ������ĳ���
         * public static int[] copyOf(int[] original,
         * int newLength)
         */
        int  data1[] = new int[]{8,9,6,7,22};
        
      /*  int  data2[] = Arrays.copyOf(data1, 4);
        for(int i=0;i<data2.length;i++){
        	System.out.println(data2[i]);
        }*/
        
        /**
         * ���������
         * int[] Ҫ���������  
         * public static void sort(int[] a)
         */
        // ����֮ǰ
        for(int i=0;i<data1.length;i++){
        	System.out.println(data1[i]);
        }
        
        System.out.println("========================");
        Arrays.sort(data1);
        // ����֮��
        for(int i=0;i<data1.length;i++){
        	System.out.println(data1[i]);
        }
        
        /**
         * src :ԭ����
         * srcPos��ԭ������ʼ���±�
         * dest��Ŀ������
         * destPos��Ŀ���������ʼ�±�
         * length��Ҫ��������ĳ���
         * public static void arraycopy(Object src,
         *                   int srcPos,
                             Object dest,
                             int destPos,
                             int length)
                             
                             ������.��������();
              System.arrayCopy();                
             
         */
        System.out.println("---------------------------");
        // ԭʼ���� ����double���͵�����
        double  ddata1[] = new double[]{
        		12.5,23.6,45.5,2.3,78.6,91.5,65.2};
        // ����һ��double���͵�Ŀ������
        double ddata2[] = new  double[12];
        System.arraycopy(ddata1, 0, ddata2, 3, 6);
        // ���ƺ������������
        for(int i=0;i<ddata2.length;i++){
        	System.out.println(ddata2[i]);
        }
        
        
         
	}

}
