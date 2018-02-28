package com.ajia.day4;

public class Test20 {

	public static void main(String[] args) {
		try{
		Chen  chen =null;
		chen.fun();
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}

class Chen{
	public void fun(){
		System.out.println("BBBBBBBB");
	}
}
