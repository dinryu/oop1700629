package com.hanbit.oop.controller;

import java.util.Scanner;

import com.hanbit.opp.service.BmiService;
import com.hanbit.opp.service.CalcService;
import com.hanbit.opp.service.Calculator2Service;
import com.hanbit.opp.service.CalculatorService;
import com.hanbit.opp.service.EvenSumService;
import com.hanbit.opp.service.GradeService;
import com.hanbit.opp.service.LeapYearService;
import com.hanbit.opp.service.TaxService;

public class Controller {
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		//String flag=s.next(); switch문에 바로 입력
		CalcService c=new CalcService();
		
        while (true) {
        	System.out.println("0.stop 1.bmi 2.tax 3.Leap 4.Calc1 5.EvenSum \n ");
        	System.out.println("6.Calc2 7.+ 8.- 9.* 10./ 11.grade \n ");
        	
			switch (s.next()) {
				case "0":
					System.out.println("stop stop");
					return;
				case "1":
					BmiService bm=new BmiService();
					System.out.print("Enter Height?\n");
					double height = s.nextDouble()/100;
					bm.setHeight(height);
					System.out.print("Enter Weight?\n");
					double weigth = s.nextDouble();
					bm.setWeigth(weigth);
					bm.setResult();
					bm.setBmi();									
					System.out.print("BMI ="+bm.getResult()+"입니다\n");
					break;
				case "2":
					TaxService s2=new TaxService();	
					
					System.out.print("이름 입력?\n");
					String name1 = s.next();
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
						   ,name1,pay,(int)(rate*100),tax));
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
                	System.out.println("첫 값?");
            		String a=s.next();
            		System.out.println("둘 값?");
            		String b=s.next();	
            		String plus=c.calcPlus(a, b);
            		System.out.print("더하기 결과값:"+plus);
					return;	
                case "8":             	
                	System.out.println("첫 값?");
                	String a8=s.next();
                	System.out.println("둘 값?");
                	String b8=s.next();
                	String minus=c.calcMinus(a8, b8);
            		System.out.print("빼기 결과값:"+minus);				
					return;	
                case "9":               	
                	System.out.println("첫 값?");
                	String a9=s.next();
                	System.out.println("둘 값?");
                	String b9=s.next();
                	String multi=c.calcMulti(a9, b9);
            		System.out.print("곱하기 결과값:"+multi);					
					return;	
                case "10":               	
                	System.out.println("첫 값?");
                	String a10=s.next();
                	System.out.println("둘 값?");
                	String b10=s.next();
                	String divid=c.calcMulti(a10, b10);
            		System.out.print("나누기 결과값:"+divid);
					return;					
				
				default:
					break;
			}
		}		
	}
}
