package com.ajia.day4;

public class Test16 {

	public static void main(String[] args) {
		 System.out.println(add(12,12,12,12,14));
	}
    
	public static int add(int ... data){
		int sum =0;
		for(int x:data){
			sum+=x;
		}
		return sum;
	}
}
