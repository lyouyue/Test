package com.ajia.day4;

public class Test25 {

	public static void main(String[] args) {
		Persond per = new Persond();
		per.fun();
	}
}
class Persond extends Exception{
	public void fun(){
		int a =10/0;
		System.out.println("hello world");
	}
}
