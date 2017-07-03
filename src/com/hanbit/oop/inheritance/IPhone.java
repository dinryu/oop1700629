package com.hanbit.oop.inheritance;

public class IPhone extends CellPhone{
	
	protected String data;
	//KIND 는 스마트폰이라고 overriding ...
	public final static String BRAND="아이폰";
	public final static String KIND="스마트폰";

	public void setData(String data){
		this.data=data;
		setPortable(true);
	}

	public String getData(){
		return data;
	}
	
	@Override
	public String toString(){
		//smartphone이기 때문에 이동가능한 상태로 홍길동에게 010-000-000번호로
		//아이폰 사용해서 문자를 전송했다.
		return String.format("%s 이기에 %s 상태로 %s 에게 %s 번호로 %s 을 사용해서 %s 이라고 전송"
				,KIND
                ,move
				,name
				,phoneNo
				,BRAND			
				,data);
	}
}
