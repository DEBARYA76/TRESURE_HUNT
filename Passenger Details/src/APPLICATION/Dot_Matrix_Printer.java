package APPLICATION;
import java.util.*;


import Model.Passenger;

import Model.Passenger;
public class Dot_Matrix_Printer {

	public static void main(String[] args) {



		Scanner scanner = new Scanner(System.in);


		System.out.println("Enter the number of passengers:");
		int n=scanner.nextInt();
		Passenger[] obj=new Passenger[n];
		int i=0;
		while(i<n)
		{
			System.out.println(" Passenger "+ (i+1));
			System.out.println("Enter TicketId:");
			int ticketid=scanner.nextInt();
			scanner.nextLine();
			System.out.println("Enter name:");
			String name=scanner.nextLine();

			System.out.println("Enter gender");
			String gender=scanner.nextLine();

			System.out.println("Enter address");
			String address=scanner.nextLine();
			obj[i]=new Passenger( ticketid,name,gender,address);
			
			i++;

		}i=0;

		while(i<n)
		{System.out.println(obj[i]);
		i++;}

		
		System.out.println("Thanks.The customer enrolled have the details:");

	}




}
