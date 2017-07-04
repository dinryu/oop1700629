package com.hanbit.oop.controller;

import javax.swing.*;

import com.hanbit.oop.domain.MemberBean;
import com.hanbit.opp.service.AdminService;
import com.hanbit.opp.serviceImpl.AdminServiceImpl;
public class AdminController {
	public static void main(String[] args){
		String scount = JOptionPane.showInputDialog("몇명 입력 합니까?");
		int limit = Integer.parseInt(scount);
		AdminService service = new AdminServiceImpl(limit);
		MemberBean member= null; 
		String sList = "";
		
		while(true){
			switch (JOptionPane.showInputDialog(
					"0.exit 1.add 2.cnt 3.list 4.findById 5.findByName 6.update")){
			case "0":				
				return;
			case "1":
				member= new MemberBean();
				//member.setName(JOptionPane.showInputDialog("name / id / pass / ssn ?"));
				String[] arr = JOptionPane.showInputDialog("name / id / pass / ssn ?").split("/");
				member.setName(arr[0]);
				member.setId(arr[1]);
				member.setPass(arr[2]);
				member.setSsn(arr[3]);
				//member.setId(JOptionPane.showInputDialog("id?"));
				//member.setPass(JOptionPane.showInputDialog("pass?"));
				//member.setSsn(JOptionPane.showInputDialog("ssn?"));
				service.addMember(member);
				JOptionPane.showMessageDialog(null, member.getName()+" 회원가입 성공");
			    break;
			case "2":
				JOptionPane.showMessageDialog(null, service.countMembers());
				break;
			case "3":
				MemberBean[] list=service.getMembers();
				/*
				JOptionPane.showMessageDialog(null, "1번째 "+list[0]);
				JOptionPane.showMessageDialog(null, "2번째 "+list[1]);
				JOptionPane.showMessageDialog(null, "3번째 "+list[2]);
				*/
				for(int i=0;i<list.length;i++){
					sList += list[i].toString()+"\n";
					
				}
				JOptionPane.showMessageDialog(null, "리스트 \n"+sList);
				break;
			case "4":
				//service.findById(JOptionPane.showInputDialog("조회 id?"));
				member = service.findById(JOptionPane.showInputDialog("조회 id?"));
				JOptionPane.showMessageDialog(null, member.toStirng());
				break;
			case "5":
				String name =JOptionPane.showInputDialog("조회 name?");
				MemberBean[] members=service.findByName(name);
				String result="";
				if(members.length==0){
					result = "조회한 사람이 없습니다.";
				}else{
					for(int i=0;i<members.length;i++){
						result+=members[i].toStirng()+"\n";
					}
				}
				JOptionPane.showMessageDialog(null, result);
				break;

			case "6":
				member = service.findById(JOptionPane.showInputDialog("수정회원 id?"));
				JOptionPane.showMessageDialog(null, member.toStirng());
				member.setPass(JOptionPane.showInputDialog("수정 pass?"));
				service.updatePass(member);
				break;
			default:
				break;
			}
		}		
	}	
}
