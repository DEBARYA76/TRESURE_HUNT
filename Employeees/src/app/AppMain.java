package app;

import java.util.Scanner;

import model.Passenger;

public class AppMain {

	private static Object ticketid;

	public static void main(String[] args) 
	{
		
		
		int n=10,i=1;
		while(i<n)
		System.out.println("Enter gender");
		Scanner sc = new Scanner(System.in);
		String gender=sc.nextLine();

		System.out.println("Enter address");
		String address=sc.nextLine();
		Object name = null;
		model.Passenger[] obj = null;
		obj[i]=new model.Passenger( ticketid,name,gender,address);
		
		i++;
	}

}
