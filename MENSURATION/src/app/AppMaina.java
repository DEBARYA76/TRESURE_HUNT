package app;

import java.util.Scanner;

import model.Square;

public class AppMaina {

	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter length of rectangle: ");
		int len=sc.nextInt();
		System.out.println("Enter breadth of rectangle: ");
		int bre=sc.nextInt();
		System.out.println("Enter side of Square");      
		int side=sc.nextInt();
		Square ob=new Square(len,bre,side);
		ob.mens();
		int n=10,i=0;
		Square[] sq = new Square[n];

		while(i<n)
		{System.out.println("Enter value of side of SQUARE"+ (i+1)+": ");
		int side1=sc.nextInt();

		sq[i]=new Square(side1,side1,side1);
		i++;


		}i=0;
		while(i<n)
		{
			System.out.println(sq[i]);	i++;
		}

	}

}
