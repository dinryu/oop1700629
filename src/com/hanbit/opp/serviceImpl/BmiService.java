package com.hanbit.opp.serviceImpl;

public class BmiService {
	private double height,weigth,bmi;
	private String result;
		
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeigth() {
		return weigth;
	}
	public void setWeigth(double weigth) {
		this.weigth = weigth;
	}

	public double getBmi(){
		return bmi;
	}
	public void setBmi(){
		this.bmi = weigth/(height*height);
	}
	
	public String getResult(){
		return result;
	}
	public void setResult(){												
		if(bmi < 18.5){
			result = "(저체중)";
		}else if(bmi <= 24.9){
			result = "(정상체중)";			
		}else if(bmi <= 29.9){
			result = "(과체중)";
		}else if(bmi >= 30){
			result = "(비만)";
		}else {
			result = "error";
		}			
	}
	
}
