package com.emmanueliyere.finances;

public class UserDomain {

	private final CalService cal;
	
	public UserDomain(){
		
		this(new CalService());
	}
	
	UserDomain(CalService cal){
		this.cal = cal;
		
	}
	
	public void save(String name){
		cal.save(name);
	}
}
