package com.hanbit.oop.controller;

import javax.swing.*;

import com.hanbit.oop.domain.MemberBean;
import com.hanbit.opp.service.AdminService;
import com.hanbit.opp.serviceImpl.AdminServiceImpl;
public class AdminController {
	public static void main(String[] args){
		AdminService service = new AdminServiceImpl();
		MemberBean member= null; 				
		while(true){
			switch(JOptionPane.showInputDialog(
					"0.exit 1.add 2.cnt 3.list 4.findById 5.findByName 6.update 7.delete")){
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
				String sList = "";
				MemberBean[] list=service.getMembers();
				/*
				JOptionPane.showMessageDialog(null, "1번째 "+list[0]);
				JOptionPane.showMessageDialog(null, "2번째 "+list[1]);
				JOptionPane.showMessageDialog(null, "3번째 "+list[2]);
				*/
				for(int i=0;i<service.countMembers();i++){
					sList+=list[i].toStirng()+"\n";					
				}
				JOptionPane.showMessageDialog(null, "리스트 \n"+sList);
				break;
			case "4":
				//service.findById(JOptionPane.showInputDialog("조회 id?"));
				member = service.findById(JOptionPane.showInputDialog("조회 id?"));
				
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

			case "6":/*
				member = service.findById(JOptionPane.showInputDialog("수정회원 id?"));
				JOptionPane.showMessageDialog(null, member.toStirng());
				member.setPass(JOptionPane.showInputDialog("수정 pass?"));
				service.updatePass(member);
				*/
				String foo = JOptionPane.showInputDialog("아이디 / 비번 ?");
				String[] idPass=foo.split("/");
				member = new MemberBean();
				member.setId(idPass[0]);
				member.setPass(idPass[1]);
				service.updatePass(member);
				JOptionPane.showMessageDialog(null, "수정완료");
				break;
			case "7":
				String id = JOptionPane.showInputDialog("삭제회원 id?");
				service.delete(id);
				JOptionPane.showMessageDialog(null, "삭제완료");
				break;
			default:
				break;
			}
		}		
	}

	
}
