package com.hanbit.oop.controller;

import java.util.Scanner;
import com.hanbit.oop.domain.MemberBean;
import com.hanbit.opp.service.MemberService;
import com.hanbit.opp.serviceImpl.MemberService2;
import com.hanbit.opp.serviceImpl.MemberServiceImpl;

import javax.swing.*;

public class MemberController {

	public static void main(String[] args) {
		//Scanner s=new Scanner(System.in);
		//MemberService2 mem=new MemberService2();
		MemberService mem=new MemberServiceImpl();
		MemberBean member=new MemberBean();
		
		while(true){
			
			//System.out.println("0.end 1.join 2.login");
			//String flag=JOptionPane.showInputDialog("0.end 1.join 2.login");
			//switch(s.next()){
			switch(JOptionPane.showInputDialog("0.end 1.join 2.login")){
			case "0":
				System.out.println("종료!!");
				return;
			case "1":
				//System.out.println("성명?");								
				//String name = JOptionPane.showInputDialog("성명?");
				member.setName(JOptionPane.showInputDialog("성명?"));
				//System.out.println("아이디?");
				//String id = s.next();
				member.setId(JOptionPane.showInputDialog("아이디?"));
				//System.out.println("비번?");
				//String pass = s.next();
				member.setPass(JOptionPane.showInputDialog("비번?"));
				//System.out.println("주민번호?");
				//String ssn = s.next();
				member.setSsn(JOptionPane.showInputDialog("sssn?"));				
				//String welcom=mem.join(member);
				//System.out.println(welcom);
				//System.out.println(mem.join(member));
				JOptionPane.showMessageDialog(null, mem.join(member));
				break;
			case "2":
				//System.out.println("아이디?");
				//String logid = s.next();
				member.setId(JOptionPane.showInputDialog("2아이디?"));
				//System.out.println("비번?");
				//String logpass = s.next();
				member.setPass(JOptionPane.showInputDialog("2비번?"));
				//mem.setLogin(logid,logpass);				
				//System.out.println(mem.login(member,mem));
				JOptionPane.showMessageDialog(null, mem.login(member));
				
				return;
			default:
			    break;
			}
		}

	}

}
