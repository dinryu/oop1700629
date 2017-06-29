package com.hanbit.opp.service;

public class BmiService {
	public String execute(double h,double w){
				
		double result = 0;
		String bmi ="BMI";
		
		result = w/(h*h);
				
		if(result < 18.5){
			bmi = "(lowWeight)";
		}else if(result <= 24.9){
			bmi = "(stanWeight)";			
		}else if(result <= 29.9){
			bmi = "(overWeight)";
		}else if(result >= 30){
			bmi = "(heavy)";
		}else {
			System.out.print("error");
		}	
		return bmi;
	}

}
