package com.ajia;

public class Teacher extends Person4 {
	public int techerNum; // �����ʦ�ı��
	public String title ;// �����ʦ��ְ��
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
		return "������"+name+",���䣺"+age+
		",��ţ�"+techerNum+",ְ�ƣ�"+title;
	}
}
