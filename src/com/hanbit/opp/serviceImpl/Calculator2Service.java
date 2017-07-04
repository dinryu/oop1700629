package com.hanbit.opp.serviceImpl;

public class Calculator2Service {

	public int executeCal2(String opcode1,int num11,int num22) {
		        
		int result1 =0;
		if(opcode1.equals("+")){
            result1 = num11 + num22;
         } else if(opcode1.equals("-")){
            result1 = num11 - num22;
         } else if(opcode1.equals("*")){
            result1 = num11 * num22;
         } else if(opcode1.equals("/")){
            result1 = num11 / num22;
         } else{
            System.out.print("opcode error!!!");
         }        
        
        return result1;

	}

}
