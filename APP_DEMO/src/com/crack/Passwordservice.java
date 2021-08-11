package com.crack;

import com.crackjob.contr.*;
public class Passwordservice 
{


	public int  checkpassword(String updatepw,User user)
	{ 
		int i=0,a=0,b=0,c=0,d=0,flag=1;;
		while(i<=updatepw.length())
		{ 
			//System.out.println(i);
			int ch=updatepw.charAt(i);
			//System.out.println(ch);
			if( ( ch>=65) &&  (ch<=90) )  
				a++;
			if((ch>=97) &&  (ch<=122))	
				b++;
			if((ch>=30) &&  (ch<=39))	
				c++;
			if(ch>=32 && ch<=47 || ch<=58 && ch>=64 || ch>=91 &&ch<=96 ||ch>= 123 && ch<=126)	
				d++;
			//System.out.println(d);
			i++;
		}
		if(a== 0)
		{ System.out.println("ENTER PASSWORD WITH ATLEAST 1 UPPERCASE \n");flag=0;}
		if(b== 0 )
		{ System.out.println("ENTER PASSWORD WITH ATLEAST 1 LOWERCASE \n");flag=0;}
		if(c== 0 )
		{ System.out.println("ENTER PASSWORD WITH ATLEAST 1 NUMERIC \n"); flag=0;}
		if(d== 0 )
		{ System.out.println("ENTER PASSWORD WITH ATLEAST 1 SPECIAL CHARACTER ");flag=0;}

		System.out.println("MAKE YOUR PASSWPRD STRONG \n");
		if(flag == 1)
		{user.pw=updatepw;
		return 1;}
		else

			return 0;
	}
}