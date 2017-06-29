package com.hanbit.opp.service;

import java.util.Scanner;

public class GradeService {
	//field
	private int kor, eng, math, total,avg;
	private String grade,name;
	public void setKor(int kor){
		this.kor=kor;
	}
	public void setEng(int eng){
		this.eng=eng;
	}
	public void setMath(int math){
		this.math=math;
	}		
	public void setTotal() {
		this.total = kor+eng+math;
	}
	public void setAvg() {
		this.avg = total/3;
	}
	public void setName(String name){
		this.name = name;
	}
	
	public int getKor() {
		return kor;
	}
	public int getEng() {
		return eng;
	}
	public int getMath() {
		return math;
	}
	public int getTotal(){
		return total;
	}
	public int getAvg(){
		return avg;
	}
	public String getName(){
		return name;
	}

	public void setGrade(){	
		setTotal();
		setAvg();
		switch(avg/10){
			case 9: case 10:
			    grade = "A학점 전액장학금대상";
			break;
			case 8: 
			    grade = "B학점 반액장학금대상";
			break;
			case 7: 
			    grade = "C학점 수료대상";
			break;
			case 6: 
			    grade = "D학점 재수강 대상";
			break;			
			default : 
			    grade = "F학점 엄마에게 통보 대상";
			break;
	
		}
    }
	public String getGrade(){
		return grade;
	}
	public String toStirng(){
		return "==================="
			  +"이름           성적   "
			  +"-------------------"
			  +name+"\t"+grade+"\n"
			  +"===================";
	}
	
	
}
