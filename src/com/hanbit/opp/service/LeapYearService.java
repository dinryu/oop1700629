package com.hanbit.opp.service;

public class LeapYearService {

	public  String executeLeap(int year) {
		
		
		int remainder1 = year % 4;
		int remainder2 = year % 100;
		int remainder3 = year % 400;
		
		System.out.println(remainder1);
		System.out.println(remainder2);
		System.out.println(remainder3);
		
		String msg = "";
		
		if(remainder1 == 0 && remainder2 != 0){
			msg = "윤년입니다";
		}else if(remainder2 == 0 && remainder3 == 0){
			msg = "윤년입니다";
		}else {
			msg = "평년입니다";
		}
		return msg;
	}

}
