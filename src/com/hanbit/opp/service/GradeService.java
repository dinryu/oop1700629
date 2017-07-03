package com.hanbit.opp.service;

import java.util.Scanner;

import com.hanbit.oop.domain.GradeBean;

public class GradeService {
	//field	
	public int calcTotal(GradeBean g){
		/*
		int kor = Integer.parseInt(g.getKor());
		int eng = Integer.parseInt(g.getEng());
		int math = Integer.parseInt(g.getMath());
		return (kor+eng+math);
		*/
		return (Integer.parseInt(g.getKor())+Integer.parseInt(g.getEng())+
				Integer.parseInt(g.getMath()));
	}
	public int calcAvg(int total){
		return total/3;
	}

	public String getGrade(int avg){	
        String grade ="";

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
		return grade;
    }	
}
