package com.hanbit.opp.serviceImpl;

import com.hanbit.oop.domain.GradeBean;
import com.hanbit.opp.service.GradeService;

public class GradeServiceImpl implements GradeService{

	@Override
	public int calcTotal(GradeBean g) {
		return (Integer.parseInt(g.getKor())+Integer.parseInt(g.getEng())+
				Integer.parseInt(g.getMath()));
	}

	@Override
	public int calcAvg(int total) {
		return total/3;
	}

	@Override
	public String getGrade(int avg) {
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
