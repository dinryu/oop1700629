package com.hanbit.opp.service;

public class MemberService {
	private String name,id,pass,ssn,gender,age,message;
	
	public void setAge(){

		int year = Integer.parseInt(ssn.substring(0,2));
		int gap =17-year;
		if(gap>=0){
			this.age=String.valueOf(2017-(year+2000));
		}else{
			this.age=String.valueOf(2017-(year+1900));
		}						
	}
	public String getAge(){
		return age;
	}
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
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
	
		this.ssn = ssn;
	}
	public String getGender() {
		
		return gender;
	}
	public void setGender() {
		char ch = ssn.charAt(7);
		
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
		this.gender = gender;
	}
	
	public void setLogin(String logid,String logpass){
		String message = "";
		
        if(logid.equals(this.id) && (logpass.equals(this.pass))){
        	setAge();
        	setGender();      	
        	message = toString();	
		}else{
			message = "login 다시...";
		}
	}
	public String getLogin(){
		return message;
	}
	
	public String toStirng(){
		return "welcom"+name+"( "+gender+":"+age+"세 )";
	}
	
	
	
	
	
	

}
