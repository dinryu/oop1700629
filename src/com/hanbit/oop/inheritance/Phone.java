package com.hanbit.oop.inheritance;

public class Phone {

	protected String name,phoneNo,brand,call;
	public final static String KIND="집전화";
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getBrand(){
		return brand;
	}
	
	public void setBrand(String brand){
		this.brand = brand;
	}
	/*
	public String getKind(){
		return kind;
	}
	
	public void setKind(String kiind){
		this.kind= kind;
	}
	*/
	public String getCall(){
		return call;
	}
	
	public void setCall(String call){
		this.call = call;
	}
	
	public String toString(){
		return String.format("%s 에게 %s 번호로 %s %s 를 사용해서 %s"
				,name,phoneNo,brand,KIND,call);				
	}
		

}
