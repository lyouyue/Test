package com.ajia.day4;

public class Test15 {
    /**
     * 可变参数
     * 
     */
	public static void main(String[] args) {
        System.out.println( add(12,12));
        System.out.println( add(12,12,12));
        System.out.println( add(12,12,12,12));
        int data[] ={12,15,15,15};
        System.out.println(add(data));
	}
	public  static int add(int a,int b){
		return a+b;
	}
	public static int add(int a,int b,int c){
		return a+b+c;
	}
	public static int add(int a,int b,int c,int d){
		return a+b+c+d;
	}
	public static int add(int a[]){
		int sum =0;
		/*for(int aa:a){
			sum+=aa;
		}*/
		for(int i=0;i<a.length;i++){
			sum+=a[i];
		}
		return sum;
	}
}
