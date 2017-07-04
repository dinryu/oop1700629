package com.hanbit.opp.serviceImpl;

public class CalculatorService {

	public int executeCal(int opcode,int num1,int num2) {
		        
        int result = 0;
        String a =null;
		if(opcode == 1){
           result = num1 + num2;
        } else if(opcode == 2){
           result = num1 - num2;
        } else if(opcode == 3){
           result = num1 * num2;
        } else if(opcode == 4){
           result = num1 / num2;
        } else{
           System.out.print("reselect opcode");
        }
        
		return result;
        

	}

}
