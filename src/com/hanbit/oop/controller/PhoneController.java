package com.hanbit.oop.controller;

import javax.swing.*;

import com.hanbit.oop.inheritance.AndroidPhone;
import com.hanbit.oop.inheritance.CellPhone;
import com.hanbit.oop.inheritance.IPhone;
import com.hanbit.oop.inheritance.Phone;
public class PhoneController {
	
	public static void main(String[] agrs){
		Phone ph=new Phone();
		CellPhone nokia = new CellPhone();
		IPhone iphone = new IPhone();
		AndroidPhone android=new AndroidPhone();
		
		while (true) {
			switch (JOptionPane.showInputDialog("0.종료 1.집전화 2.휴대폰 3.IPhone 4.안드로이드")) {
			case "0":
				JOptionPane.showMessageDialog(null, "stop....");
				return;
			case "1":
				ph.setName(JOptionPane.showInputDialog("이름?"));
				ph.setPhoneNo(JOptionPane.showInputDialog("전화번호?"));
				ph.setBrand(JOptionPane.showInputDialog("전화brand?"));
				//ph.setKind(JOptionPane.showInputDialog("기종?"));
				ph.setCall(JOptionPane.showInputDialog("내용?"));
				JOptionPane.showMessageDialog(null, ph.toString());
				return;
			case "2":
				nokia.setName(JOptionPane.showInputDialog("이름?"));
				nokia.setPhoneNo(JOptionPane.showInputDialog("전화번호?"));
				nokia.setBrand(JOptionPane.showInputDialog("전화brand?"));
				nokia.setPortable(true);
				//nokia.setKind(JOptionPane.showInputDialog("기종?"));
				nokia.setCall(JOptionPane.showInputDialog("내용?"));
				JOptionPane.showMessageDialog(null, nokia.toString());
				break;
			case "3":
				iphone.setName(JOptionPane.showInputDialog("이름?"));
				iphone.setPhoneNo(JOptionPane.showInputDialog("전화번호?"));
				iphone.setData(JOptionPane.showInputDialog("문자 message?"));
				JOptionPane.showMessageDialog(null, iphone.toString());
				break;
			case "4":
				android.setName(JOptionPane.showInputDialog("이름?"));
				android.setPhoneNo(JOptionPane.showInputDialog("전화번호?"));
				android.setSize(JOptionPane.showInputDialog("어플?"));
				android.setAppl(JOptionPane.showInputDialog("사이즈?"));
				android.setData(JOptionPane.showInputDialog("문자 message?"));
				JOptionPane.showMessageDialog(null, android.toString());
				break;
			default:
				JOptionPane.showMessageDialog(null, "error....");
				break;
			}
			
		}
		
		
	}

}
