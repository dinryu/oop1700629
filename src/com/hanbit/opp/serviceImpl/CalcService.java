package com.hanbit.opp.serviceImpl;

import java.util.Scanner;

public class CalcService {
	
	public String calcPlus(String a, String b){
		String plus="";
		int num1=Integer.parseInt(a);
		int num2=Integer.parseInt(b);
		plus =String.valueOf(num1+num2);
		return plus;
	}
	public String calcMinus(String a, String b){		
		return String.valueOf(Integer.parseInt(a)-Integer.parseInt(b));
	}
	public String calcMulti(String a, String b){
		return String.valueOf(Integer.parseInt(a)*Integer.parseInt(b));
	}
	public String calcDivide(String a, String b){
		return String.valueOf(Integer.parseInt(a)/Integer.parseInt(b));
	}
}
