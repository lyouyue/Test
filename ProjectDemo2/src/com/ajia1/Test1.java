package com.ajia1;

public class Test1 {
	public static String country; //属性 或者成员变量
	/**
	 * static可以在属性和方法 
	 * 全局数据区 ,不需要实例化就可以调用
	 * static 调用
	 * 类名称.属性 
	 * 类名称.方法()
	 * 
	 * 继承
	 *   少写代码 扩充父类的功能
	 *  extends  扩展 ，扩充
	 *  继承定义
	 *  class 子类  extends 父类{
	 *    
	 *  } 
	 *  
	 *  继承限制
	 *  1、子类访问权限不能高于父类访问权限
	 *  2、父类私有属性和方法是不能继承
	 *  3、一个子类只能有一个父类，一个父类可以有多个子类
	 *  
	 *  final关键字
	 *  属性  属性用了final修饰是常量
	 *  方法  方法用了final修饰不能实现覆写
	 *  类   类用final不能被继承
	 *  
	 *  方法的覆写
	 *     子类在继承父类时候,继承方法方法名称相同，返回类型相同
	 *     参数类型相同，参数个数相同，只是执行功能改变，叫做方法的覆写
	 * 为什么要有方法的覆写
	 *  
	 *       Arrays 类中
	 *  1、是把数组中的转换字符串的类型
	 * public static String toString(数组)
	   
	 * 2、复制数组到指定数组长度中
     * original  要复制的数组
     * newLength  指定数组的长度
     * public static int[] copyOf(int[] original,
     * int newLength)
     * 3、数组的排序
     * int[] 要排序的数组  
     * public static void sort(int[] a)
     * 
     * System 类中
    * src :原数组
    * srcPos：原数组起始地下标
    * dest：目标数组
    * destPos：目标数组的起始下标
    * length：要复制数组的长度
    * public static void arraycopy(Object src,
     *      int srcPos,
            Object dest,
            int destPos,
            int length)
                      类名称.方法名称();
            System.arrayCopy(); 
     * 
     * 定义类
     *   class 类名称{
     *   
     *   }
     *  实例化对象
     *  
     *  类名称  对象名称 = new 类名称();
     *  类名称  对象名称 = null ;
     *  对象名称 = new  类名称();
     *  
     *  属性和方法
     *  对象名称.属性;
     *  对象名称.方法();
     *  
     *  this 
     *  属性前面:表示当前类的属性
     *  方法前面:表示的是当前类的方法
     *  this():表示的构造方法
     *  this:表示的是当前类
     *  
     *  数组定义 
     *    数据类型  数组名 [] = new  数据类型[数组长度];
     *    int data[] = new int[25];
     *    静态数组的初始化
     *    数据类型  数组名称[] = {值,值,...};
     *  数组长度 
     *     数组名.length;
     *  数组怎么赋值
     *     数组名[下标]=值;
     *  数组怎么输出
     *    for(int i =0 ;i<数组名.length;i++){
     *        数组名[下标];
     *    }
     *  数组的下标是从零开始的
     *  
     *  
     *  类为什么要使用封装性
     *    
     *  匿名对象
     *  方法定义
     *  逻辑控制
     *  public 和不加public 
     *  jdk和jre有什么区别
     *  
     *  String
     *  mysql 
     *  
	 */
	public static void main(String[] args) {
		  String countrys; // 定义一个字符串的变量
		  int  num ;

	}

}
