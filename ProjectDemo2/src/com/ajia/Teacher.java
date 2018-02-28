package com.ajia;

public class Teacher extends Person4 {
	public int techerNum; // 定义教师的编号
	public String title ;// 定义教师的职称
	public int getTecherNum() {
		return techerNum;
	}
	public void setTecherNum(int techerNum) {
		this.techerNum = techerNum;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String info(){
		return "姓名："+name+",年龄："+age+
		",编号："+techerNum+",职称："+title;
	}
}
