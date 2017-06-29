package com.hanbit.opp.service;

import java.util.Scanner;
public class GradeReportService{
	public static void main(String[] args){	
		/* name, kor, eng, math
		 total, avg
		 90이상 a 80 b 70 c 60 d 50이하 f
		// return 홍길동 :  ?
		*/
		int kor=0,eng=0,math=0,total=0,avg=0;
		String grade = "";
		
		Scanner sc=new Scanner(System.in);
		System.out.print("이름을 입력하세요?\n");
		String name = sc.next();
		System.out.print("국어 점수를 입력하세요?\n");
		kor = sc.nextInt();
		System.out.print("영어 점수를 입력하세요?\n");
		eng = sc.nextInt();
		System.out.print("수학 점수를 입력하세요?\n");
		math = sc.nextInt();
		
		total = kor + eng + math;
		avg = total / 3;
			
		if(avg >= 90){
			grade = "A";
		}else if(avg >= 80){
			grade = "B";			
		}else if(avg >= 70){
			grade = "C";
		}else if(avg >= 60){
			grade = "D";
		}else{
			grade = "F";
		}
		System.out.print("***********************************\n");
		System.out.print("* 이름     총점    평균    등급 *\n");
		System.out.print("-----------------------------------\n");		
		System.out.print(
		String.format("| %s |  %4d |  %4d |    %s |\n",name,total,avg,grade));
		System.out.print("***********************************\n");
			
	}
}