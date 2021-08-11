package com.crackjob.contr;

import java.text.ParseException;
/*import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;*/
import java.util.Scanner;

import com.crack.Passwordservice;
import com.crack.User;
import com.crack.userservice;

public class Appmain {


	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		User user = new User();

		System.out.println("WELCOME TO CRACKJOB");
		/*System.out.println("Enter name: ");
		user.name = scanner.nextLine();

		System.out.println("Enter email: ");
		user.email = scanner.nextLine();*/
		System.out.println("Enter pw: ");
		user.pw = scanner.nextLine();

		/*System.out.println("Enter your date of birth (dd-MM-yyyy): ");
		String dob = scanner.next();

		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
		Date date = (Date) formatter.parse(dob);
		user.date=date;*/
		scanner.nextLine();
		System.out.println("Enter updated pw: ");

		String updatepw = scanner.nextLine();


		/*System.out.println("BEFORE UPDATION");
		System.out.println("\n NAME: "+ user.name+"\n    mail "+user.email);
		System.out.println(" \n DOB: "+user.date+" \n  PASSWORD "+ user.pw)*/

		//userservice obj = new userservice();

		//int flag = obj.updatepassword(updatepw, user);
		System.out.println();
		System.out.println("-------------------------Cred recieved-----------------------------------");
		System.out.println("\n");
		//if(flag==1) {//User
		//System.out.println("Welcome Home \n ");

		//System.out.println("\n NAME: "+ user.name);
		//System.out.println("\n mail: "+user.email);
		//System.out.println("\n DOB: "+user.date);
		//System.out.println("\n UPDATED PASSWORD: "+ user.pw);
		Passwordservice  obj1 = new Passwordservice();

		int flag1 = obj1.checkpassword(updatepw, user);

		System.out.println(flag1);
		if(flag1==0)
			System.out.println("--------START THE PROCESS AGAIN-----------");
		else
			System.out.println("\n UPDATED PASSWORD IS STRONG "+ user.pw);
		//}else {
		//	System.out.println("Invalid cred !!");
		//}



	}

}



