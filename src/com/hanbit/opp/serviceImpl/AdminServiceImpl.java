package com.hanbit.opp.serviceImpl;

import com.hanbit.oop.domain.MemberBean;
import com.hanbit.opp.service.AdminService;

public class AdminServiceImpl implements AdminService{
	
	int count;
	MemberBean member;
	MemberBean[] list;
	
	public AdminServiceImpl(int limit) {
		count =0;
		member = new MemberBean();
		list = new MemberBean[limit];
	}
	
	@Override
	public void addMember(MemberBean member) {
		list[count]=member;
		count++;
		
	}

	@Override
	public MemberBean[] getMembers() {		
		return list;
	}

	@Override
	public int countMembers() {	
		return count;
	}

	@Override
	public MemberBean findById(String id) {
		member = new MemberBean();
		for(int i=0;i<list.length;i++){
		    if (id.equals(list[i].getId())){	
		    	member = list[i];
		    	break;	
		    } 
		}
		return member;		
	}

	@Override
	public MemberBean[] findByName(String name){
		int cnt =0;
		for(int i=0;i<list.length;i++){
		    if (name.equals(list[i].getName())){	
		    	cnt++;		    	
		    }  
		}
		MemberBean[] namelist= new MemberBean[cnt];
		int j=0;
		for(int i=0;i<list.length;i++){
		    if (name.equals(list[i].getName())){	
		    	namelist[j] = list[i];
		    	j++;		    	
		    } 
		    if(cnt < j){
	    		break;
	    	}
		}		
		return namelist;
	}

	@Override
	public void updatePass(MemberBean member){

		for(int i=0;i<list.length;i++){
		    if (member.getId().equals(list[i].getId())){	
		    	list[i] = member;
		    	break;	
		    } 
		}		
	}
}
