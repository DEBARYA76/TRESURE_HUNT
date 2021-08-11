package com.crack;

import java.util.Date;

public class User {

	public String name;
	private String email; 
	public String pw;

	//public Date date;
	public String getemail()
	{
		return this.email;
	}
	public String setemail(String newmail)
	{
		email=newmail;	
		return this.email;
	}

}
