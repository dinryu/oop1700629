package com.hanbit.opp.serviceImpl;

import com.hanbit.oop.domain.MemberBean;
import com.hanbit.opp.service.AdminService;

public class AdminServiceImpl implements AdminService{
	
	int count;
	MemberBean member;
	MemberBean[] list;
	
	public AdminServiceImpl() {
		count =0;
		member = new MemberBean();
		list = new MemberBean[count];
	}
	
	@Override
	public void addMember(MemberBean member) {
		if(count == list.length){
			MemberBean[] temp =new MemberBean[count+1];
			System.arraycopy(list, 0, temp, 0, count);
			list = temp;
		}
		list[count++]=member;		
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
	public void updatePass(MemberBean param){
        /*
		for(int i=0;i<list.length;i++){
		    if (member.getId().equals(list[i].getId())){	
		    	list[i] = member;
		    	break;		    			    	
		    } 		    
		}*/		
		member = findById(param.getId());
		member.setPass(param.getPass());
		for(int i=0;i<list.length;i++){
		    if (member.getId().equals(list[i].getId())){	
		    	list[i] = null;
		    	break;			    			    	
		    } 		    
		}
	}

	@Override
	public void delete(String id) {
		
		for(int i=0;i<count;i++){
		    if (id.equals(list[i].getId())){	
		    	list[i] = null;
		    	list[i] = list[count-1];
		    	list[count-1]=null;
		    	count--;
		    	break;			    			    	
		    } 		  
	}
	}
}
