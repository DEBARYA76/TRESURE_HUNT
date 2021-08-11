package com.crack;
import com.crackjob.contr.*;
public class userservice {


	public int  updatepassword(String updatepw,User user)
	{  
		System.out.println(updatepw);
		System.out.println("\n");
		//System.out.println("\n NAME: "+ user.name+"\n    mail "+user.email);
		//System.out.println(" \n DOB: "+user.date+" \n UPDATED PASSWORD "+updatepw);

		if(updatepw.equals(user.pw) || (updatepw.length()<6))
			return 0;
		else

		{   
			user.pw=updatepw;
			return 1;
		}

	}
	/*public void detailsPrinter(User user ) {
		System.out.println("\n NAME: "+ user.name+"\n    mail "+user.email);
		System.out.println(" \n DOB: "+user.dob+" \n UPDATED PASSWORD "+ user.pw);
	}*/
}

