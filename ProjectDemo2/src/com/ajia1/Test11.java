package com.ajia1;

/**
 *   抽象类总结
 *   1、抽象类不能被实例化,如果要实例化需要被子类继承。
 *   通过向上转型去实现实例化
 *   2、抽象类中可以没有抽象方法,但是抽象方法必须在抽
 *   象类中。
 *   3、抽象类中的抽象方法没有现实体,只是定义了一个
 *   方法名称
 *   4、构造方法,有static 修饰的地方不能出现abstract
 *   来修饰。
 *   5、抽象类中全部方法，通过子类全部覆写。
 *   
 *   一个IT 公司 有程序员和项目经理
 *   程序员：有姓名，年龄，工号
 *   行为：工作
 *   项目经理 ：有姓名 ，年龄，工号,奖金
 *   行为:工作
 *   
 *   
 */
public class Test11 {

	public static void main(String[] args) {
        // 玩游戏
		// 看片
		// 工作
		// 写代码
		Computer  com = new  DaShiXiong();
		com.writeCode();
		DaShiXiong  dsx = (DaShiXiong)com;
		dsx.luguan();
	}
}

abstract class Computer{
	//玩游戏
	public abstract void play();
	// 看片
	public abstract void lookAV();
	// 工作
	public abstract void work();
	// 写代码
	public abstract void writeCode();
}

class DaShiXiong extends Computer{
	@Override
	public void play() {
	    System.out.println("大师兄在和妹子玩游戏");
	}
	@Override
	public void lookAV() {
		System.out.println("大师兄在学习苍老师的动作");
	}
	@Override
	public void work() {
		System.out.println("大师兄假装在工作");
	}
	@Override
	public void writeCode() {
		//System.out.println("大师兄在撸代码");
	}
	public  void  luguan(){
		System.out.println("大师兄是私人爱好是...");
	}
}

class XiaoTiao extends Computer{

	@Override
	public void play() {
		 System.out.println("小田在和汉子玩游戏");
	}

	@Override
	public void lookAV() {
		 System.out.println("看重口味大片...");
	}

	@Override
	public void work() {
		 System.out.println("小田工作是在...");
	}

	@Override
	public void writeCode() {
		 System.out.println("小田在写代码...");
	}
	
	public void momo(){
		System.out.println("玩陌陌。。。");
	}
	
}

abstract class GG{
	public  GG(){}
	public  abstract  int add();
}
abstract class JJ extends GG{
	
}