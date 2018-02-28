package com.ajia.day4;

public class Test18 {
	public static void main(String[] args) {
		int aa[]  =null;
		try {
			aa= new int[3];
			aa[0] = 12;
			aa[1] = 13;
			aa[2] = 14;
			aa[3]=15;
		} catch (ArrayIndexOutOfBoundsException e) {
			// aa[3]=15;
			e.printStackTrace();
		} finally {
			System.out.println("CCCCCCCCCCCCC");
		}
		for(int x:aa){
			System.out.println(x);
		}
	}

}
