package com.hanbit.oop.controller;

import java.util.Scanner;

import com.hanbit.oop.domain.GradeBean;
import com.hanbit.opp.service.GradeService;
import com.hanbit.opp.serviceImpl.BmiService;
import com.hanbit.opp.serviceImpl.CalcService;
import com.hanbit.opp.serviceImpl.GradeService2;
import com.hanbit.opp.serviceImpl.GradeServiceImpl;

import javax.swing.*;

public class GradeController {
	public static void main(String[] args) {
		//GradeService2 gs=new GradeService2();
		GradeService gs=new GradeServiceImpl();
		GradeBean g=new GradeBean();
        while (true) {
        	
        	switch (JOptionPane.showInputDialog("0.stop 1.Grade \n ")){
				case "0":
					JOptionPane.showMessageDialog(null, "stop....");
					return;							
				case "1":
					g.setName(JOptionPane.showInputDialog("이름을 입력하세요?\n"));
					g.setKor(JOptionPane.showInputDialog("국어 점수를 입력하세요?\n"));
					g.setEng(JOptionPane.showInputDialog("영어 점수를 입력하세요?\n"));
					g.setMath(JOptionPane.showInputDialog("수학 점수를 입력하세요?\n"));

					JOptionPane.showMessageDialog(null, 
							g.getName()+"님 "+gs.getGrade(gs.calcAvg(gs.calcTotal(g))));					
					return;	
				default:
					break;
			}
		}		
	}
}
