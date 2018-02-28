package com.ajia.day4;

public class Test8 {

	public static void main(String[] args) {
		String data[] = new String[] { "陈云", "李维", "林柳" };
		/*for (int i = 0; i < data.length; i++) {
			System.out.println(data[i]);
		}*/
		for(String a :data){
			System.out.println(a);
		}
		int a[] = {12,23,45,89,45};
		for(int s:a){
			System.out.println(s);
		}
	}
}
/**
 * foreach 
 * 集合和数组
 * for(数据类型   变量 :数组名){
 * 
 * }
 */
