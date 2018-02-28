package com.ajia.day1;

// 为什么要定义Object类
// 向上转型能体现出类的多态性 ,实现参数的统一
public class Test9 {

	public static void main(String[] args) {
        AC ac = new BC();
        Object obj = ac ;
        BC bc = (BC)obj;
        bc.printBC();
	}
	
	
}
//  定义了一个接口
interface AC {
	void print();
}
class BC implements AC{
	@Override
	public void print() {
		System.out.println("-------BC------");
	}
	
	public void printBC(){
		System.out.println("=======BCBC");
	}
}
class VC implements AC{
	@Override
	public void print() {
		System.out.println("-----VC------");
	}
}
