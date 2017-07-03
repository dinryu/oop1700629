package com.hanbit.oop.domain;

public class GradeBean {
	private String kor, eng, math;
	private String major,name;
	
	public void setKor(String kor){
		this.kor=kor;
	}
	public void setEng(String eng){
		this.eng=eng;
	}
	public void setMath(String math){
		this.math=math;
	}		
	public void setName(String name){
		this.name = name;
	}
	
	public String getKor() {
		return kor;
	}
	public String getEng() {
		return eng;
	}
	public String getMath() {
		return math;
	}
	public String getName(){
		return name;
	}
	public String toStirng(){
		return "===================";
	}
	
	

}
