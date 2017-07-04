package com.hanbit.oop.domain;

public class MemberBean {
	private String name,id,pass,ssn;
	
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setId(String id){
		this.id = id;
	}
	public String getId(){
		return id;
	}
	public void setPass(String pass){
		this.pass = pass;
	}
	public String getPass(){
		return pass;
	}
	public void setSsn(String ssn) {	
		this.ssn = ssn;
	}
	public String getSsn() {
		return ssn;
	}	
	public String toStirng(){	
		System.out.println("name="+name+" id="+id+" pass="+pass+" ssn="+ssn);
		return "name="+name+" id="+id+" pass="+pass+" ssn="+ssn;
	}

}
