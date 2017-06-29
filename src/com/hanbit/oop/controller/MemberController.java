package com.hanbit.oop.controller;

import java.util.Scanner;

import com.hanbit.opp.service.MemberService;

public class MemberController {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		MemberService mem=new MemberService();
		
		while(true){
			System.out.println("0.end 1.join 2.login");
			
			switch(s.next()){
			case "0":
				System.out.println("종료!!");
				return;
			case "1":
				System.out.println("성명?");
				String name = s.next();
				mem.setName(name);
				System.out.println("아이디?");
				String id = s.next();
				mem.setId(id);
				System.out.println("비번?");
				String pass = s.next();
				mem.setPass(pass);
				System.out.println("주민번호?");
				String ssn = s.next();
				mem.setSsn(ssn);				
				System.out.println("join 완료!!");
				break;
			case "2":
				System.out.println("아이디?");
				String logid = s.next();
				System.out.println("비번?");
				String logpass = s.next();
				mem.setLogin(logid,logpass);
				
				System.out.println(mem.toString());
				return;
			default:
			    break;
			}
		}

	}

}
