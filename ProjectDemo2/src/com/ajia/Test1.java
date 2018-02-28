package com.ajia;

import java.util.Arrays;

public  class Test1 {

	public static void main(String[] args) {
		// Arrays 数组的工具类
		// 类中只有属性（成员变量） 和方法（构造方法和普通方法）
		// Field Summary 普通成员变量
		// Constructor Summary 构造方法
		//Method Summary  普通方法
		/**
		 * 是把数组中的转换字符串的类型
		 * public static String toString(数组)
		 * static 修饰的方法调用
		 * 类名称.方法名称();
		 * Arrays.toString();
		 */
		// 定义了一个字符的数组
		char  data[] = new char[]{'陈','云','我','们','项','暗','恋'};
        System.out.println(Arrays.toString(data));
        /**
         * 复制数组到指定数组长度中
         * original  要复制的数组
         * newLength  指定数组的长度
         * public static int[] copyOf(int[] original,
         * int newLength)
         */
        int  data1[] = new int[]{8,9,6,7,22};
        
      /*  int  data2[] = Arrays.copyOf(data1, 4);
        for(int i=0;i<data2.length;i++){
        	System.out.println(data2[i]);
        }*/
        
        /**
         * 数组的排序
         * int[] 要排序的数组  
         * public static void sort(int[] a)
         */
        // 排序之前
        for(int i=0;i<data1.length;i++){
        	System.out.println(data1[i]);
        }
        
        System.out.println("========================");
        Arrays.sort(data1);
        // 排序之后
        for(int i=0;i<data1.length;i++){
        	System.out.println(data1[i]);
        }
        
        /**
         * src :原数组
         * srcPos：原数组起始地下标
         * dest：目标数组
         * destPos：目标数组的起始下标
         * length：要复制数组的长度
         * public static void arraycopy(Object src,
         *                   int srcPos,
                             Object dest,
                             int destPos,
                             int length)
                             
                             类名称.方法名称();
              System.arrayCopy();                
             
         */
        System.out.println("---------------------------");
        // 原始数组 数组double类型的数组
        double  ddata1[] = new double[]{
        		12.5,23.6,45.5,2.3,78.6,91.5,65.2};
        // 定义一个double类型的目标数组
        double ddata2[] = new  double[12];
        System.arraycopy(ddata1, 0, ddata2, 3, 6);
        // 复制后的数组进行输出
        for(int i=0;i<ddata2.length;i++){
        	System.out.println(ddata2[i]);
        }
        
        
         
	}

}
