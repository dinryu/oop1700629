package com.hanbit.oop.inheritance;

public class AndroidPhone extends IPhone{
	// brand 켈럭시 노트
	// data 를 오버라이딩 해서 카톡메시지 라고 출력시킴.
	private String size,appl;
	public final static String BRAND="겔럭시노트";
	
	public void setSize(String size){
		this.size = size;
		setPortable(true);
	}
	public String getSize(){
		return size;
	}
		
	public String getAppl() {
		return appl;
	}
	public void setAppl(String appl) {
		this.appl = appl;
	}
	
	@Override
	public String toString(){
		//smartphone이기 때문에 이동가능한 상태로 홍길동에게 010-000-000번호로
		//캑럭시노트(브랜드) 6인치를 사용해서 카톡를 전송했다.
		return String.format("%s 이기에 %s 상태로 %s 에게 %s 번호로 %s %s를 사용해서 %s 이라고 %s 전송"
				,KIND
                ,move
				,name
				,phoneNo
				,BRAND
				,size
				,appl
				,data
				);
	}

}
