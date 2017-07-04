package com.hanbit.opp.serviceImpl;



public class TaxService{
	public double executeTax(int pay){
		
		double rate=0.0; 
		
						
		if(pay < 12000){
			rate = 0.08;
		}else if(pay <= 46000){
			rate = 0.17;		   
		}else if(pay <= 88000){
			rate = 0.26;
		}else {
			rate = 0.35;			
		}
						
		return rate;		
	}
}
