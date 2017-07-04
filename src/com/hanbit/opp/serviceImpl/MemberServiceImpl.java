package com.hanbit.opp.serviceImpl;

import com.hanbit.oop.domain.MemberBean;
import com.hanbit.opp.service.MemberService;

public class MemberServiceImpl implements MemberService {
	MemberBean session;
	public MemberServiceImpl(){
		session=new MemberBean();
	}

	@Override
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

	@Override
	public String getAge(MemberBean member) {

        String age = "";
        
		int year = Integer.parseInt(member.getSsn().substring(0,2));
		int gap =17-year;
		
		if(gap>=0){
			age=String.valueOf(2017-(year+2000));
		}else{
			age=String.valueOf(2017-(year+1900));
		}		
		return age;	
		
	}

	@Override
	public String join(MemberBean member) {
		session=member;	
		String welcome ="환영합니다."+session.getName();		
		return welcome;
	}

	@Override
	public String login(MemberBean member) {
		return(member.getId().equals(session.getId()) && (member.getPass().equals(session.getPass())))?
        		"성공..." : "실패...";
	}

}
