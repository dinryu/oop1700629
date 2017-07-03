package com.hanbit.opp.service;

import com.hanbit.oop.controller.MemberController;
import com.hanbit.oop.domain.MemberBean;

public class MemberService {
	MemberBean session;
	public MemberService(){
		session=new MemberBean();
	}
	
	public String getAge(MemberBean member){
		
        String age = "";
        
		int year = Integer.parseInt(member.getSsn().substring(0,2));
		int gap =17-year;
		
		if(gap>=0){
			age=String.valueOf(2017-(year+2000));
		}else{
			age=String.valueOf(2017-(year+1900));
		}		
		return age;	
		
		//return (gap>=0)? age=String.valueOf(2017-(year+2000)) : 
		//	             age=String.valueOf(2017-(year+1900));
	}	
	
	public String getGender(MemberBean member) {
		String gender ="";
		char ch = member.getSsn().charAt(7);
		
		switch(ch){
			case '1': case '3':
			    gender = "남";
			break;
			case '2': case '4':
			    gender = "여";
			break;
			case '5': case '6':
			    gender = "외국인";
			break;
			default:
			    gender = "외계인";
				break;
		}
		return gender;
	}
	public String join(MemberBean member){		
		session=member;	
		String welcome ="환영합니다."+session.getName();
		return welcome;		 
	}
	
	public String login(MemberBean member){
		/*
		String message ="",gender="",age="";		
        if(member.getId().equals(session.getId()) && (member.getPass().equals(session.getPass()))){
        	gender=getGender(member);  
        	age=getAge(member);
        	message = member.toStirng(gender,age);	
		}else{
			message = "login 다시...";
		}
		return message;
		*/
        
		return(member.getId().equals(session.getId()) && (member.getPass().equals(session.getPass())))?
        		"성공..." : "실패...";
	}
	
}
