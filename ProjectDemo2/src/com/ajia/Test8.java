package com.ajia;

public class Test8 {
    /**
     *  为什么要用继承
     *    少写代码,是一种父类功能的扩充。
     */
	
	public static void main(String[] args) {
		Teacher t = new  Teacher();
		t.name="杀马特";
	//	t.setAge(12);
		t.setTecherNum(1001);
		t.setTitle("叫兽");
		System.out.println(t.info());

	}

}
