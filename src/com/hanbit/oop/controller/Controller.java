package com.hanbit.oop.controller;

import java.util.Scanner;

import com.hanbit.opp.service.BmiService;
import com.hanbit.opp.service.CalcService;
import com.hanbit.opp.service.Calculator2Service;
import com.hanbit.opp.service.CalculatorService;
import com.hanbit.opp.service.EvenSumService;
import com.hanbit.opp.service.LeapYearService;
import com.hanbit.opp.service.TaxService;

public class Controller {
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		//String flag=s.next(); switch문에 바로 입력
        while (true) {
        	System.out.println("0.stop 1.bmi 2.tax 3.Leap 4.- 5.EvenSum \n ");
        	System.out.println("6.Calculator 7.+ 8.- 9.* 10./ \n ");
        	
			switch (s.next()) {
				case "0":
					System.out.println("stop stop");
					return;
				case "1":
					BmiService s1=new BmiService();
					System.out.print("Enter Height?\n");
					double h = s.nextDouble()/100;
					System.out.print("Enter Weight?\n");
					double w = s.nextDouble();
					
					String bmi=s1.execute(h,w);
					System.out.print("BMI ="+bmi+"입니다\n");
					break;
				case "2":
					TaxService s2=new TaxService();	
					
					System.out.print("이름 입력?\n");
					String name = s.next();
					System.out.print("연봉 입력?\n");
					int pay = s.nextInt();
					
					double rate=s2.executeTax(pay);
					
					int tax=0;
					tax =(int)(pay * rate);
									
					System.out.print("****************************************\n");
					System.out.print("* 이름     연봉      세율    세금 (단윈:천원 *\n");
					System.out.print("----------------------------------------\n");		
					System.out.print(
					       String.format("* %s | %d 천원 |  %d  |  %d 천원  :\n"
						   ,name,pay,(int)(rate*100),tax));
					System.out.print("****************************************\n");
					return;
				case "3":
					LeapYearService s3=new LeapYearService();
					System.out.print("년도를 입력하세요?\n");
					int year = s.nextInt();
					
					String msg=s3.executeLeap(year);
					System.out.print(year+"은 "+msg);					
					return;
				case "4":
					CalculatorService s4=new CalculatorService();
					System.out.print("========== Calculator ==========\n");
			        System.out.print("1.Pluse 2.Minus 3.Multi 4.Divid \n" );
			        System.out.print("=================================\n");
			        
			        System.out.print("Select Opcode?\n");
			        int opcode = s.nextInt();	                    
			        System.out.print("1st num?\n");
			        int num1=s.nextInt();
			        System.out.print("2st num?\n");
			        int num2=s.nextInt();
					
			        int result=s4.executeCal(opcode, num1, num2);
			        System.out.print("result = " + result);

					return;
				case "5":
					EvenSumService s5=new EvenSumService();
					int sum=s5.executeEven();					
					System.out.print("짝수의 합:"+sum);					
					return;	
                case "6":
                	Calculator2Service s6=new Calculator2Service();
                	System.out.print("====== Calculator2 ======\n");
            				
            		System.out.print("Enter 1st number?\n");
            		int num11 = s.nextInt();
            		System.out.print("Select Opcode(+,-,*,/)?\n");
                    String opcode1=s.next();
            		System.out.print("Enter 2st number?\n");
            		int num22 = s.nextInt();
            		
            		int result1=s6.executeCal2(opcode1, num11, num22);
            		System.out.print(String.format("%d %s %d = %d",num11,opcode1,num22,result1));           		
					return;
                case "7":
                	CalcService s7=new CalcService();
                	System.out.println("첫 값?");
            		int a7=s.nextInt();
            		System.out.println("둘 값?");
            		int b7=s.nextInt();	
            		int c7=s7.calcPlus(a7, b7);
            		System.out.print("더하기 결과값:"+c7);
					return;	
                case "8":
                	CalcService s8=new CalcService();
                	System.out.println("첫 값?");
                	int a8=s.nextInt();
                	System.out.println("둘 값?");
                	int b8=s.nextInt();
                	int c8=s8.calcMinus(a8, b8);
            		System.out.print("빼기 결과값:"+c8);
					
					return;	
                case "9":
                	CalcService s9=new CalcService();
                	System.out.println("첫 값?");
                	int a9=s.nextInt();
                	System.out.println("둘 값?");
                	int b9=s.nextInt();
                	int c9=s9.calcMulti(a9, b9);
            		System.out.print("곱하기 결과값:"+c9);
					
					return;	
                case "10":
                	CalcService s10=new CalcService();
                	System.out.println("첫 값?");
                	int a10=s.nextInt();
                	System.out.println("둘 값?");
                	int b10=s.nextInt();
                	int c10=s10.calcMulti(a10, b10);
            		System.out.print("나누기 결과값:"+c10);
					return;	
				default:
					System.out.println("enter error");
					break;
			}
		}		
	}
}
