package com.hanbit.opp.service;

import java.util.Scanner;

public class CalcService {
	
	public String calcPlus(String a, String b){
		String result="";
		int num1=Integer.parseInt(a);
		int num2=Integer.parseInt(b);
		result =String.valueOf(num1+num2);
		return result;
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
