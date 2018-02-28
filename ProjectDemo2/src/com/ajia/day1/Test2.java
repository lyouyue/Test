package com.ajia.day1;

/**
 * 接口的多实现
 *    子类  implements  接口1,接口2,....{
 *    
 *    }
 * 
 * 子类  实现接口 ,又继承抽象类 
 *
 */
interface A{
	//在A接口中定义了一个抽象方法
	public abstract void print();
}
interface B{
	public  abstract void info();
}

class C implements A ,B{
	@Override
	public void info() {
		System.out.println("hello美女陈云");
	}

	@Override
	public void print() {
		System.out.println("陈云是妹子你们要不要");
	}
	
}
public class Test2 {
	public static void main(String[] args) {
        C  c = new C();  // 直接实例化 
        c.info();
        c.print();
        
        A a = new C();
        a.print();
        
        B b = new C();
        b.info();
	}

}
