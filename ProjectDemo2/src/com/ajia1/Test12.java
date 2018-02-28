package com.ajia1;

/**
 * Employee 
 * programmer 
 * manager
 * 一个IT公司有程序员和项目经理
 *   程序员：有姓名，年龄，工号
 *   行为：工作
 *   项目经理 ：有姓名 ，年龄，工号
 *   行为:工作 ,获取奖金
 *
 */
abstract class Empolyee{
	public String name ;  // 定义雇员的姓名
	public int age; // 定义雇员的年龄
	public int number; // 定义雇员的工号
	// 定义雇员工作
	abstract void working();

	//public void eat(){}
}

class Programer extends Empolyee{
	@Override
	void working() {
		System.out.println("程序员在写代码....");
	}
}

class Manager extends Empolyee{
    public void money(){
    	System.out.println("项目经理获取奖金。。。");
    }
	@Override
	void working() {
		System.out.println("项目经理在做需求分析....");
	}
	
} 
public class Test12 {

	public static void main(String[] args) {
        Empolyee em= new Programer();
        em.working();
        // 向上转型
        Empolyee em1 = new  Manager();
        em1.working();
        //向下转型
        Manager mger = (Manager)em1;
        mger.money();
	}

}
