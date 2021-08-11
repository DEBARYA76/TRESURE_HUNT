package App;

import java.util.Scanner;

import Model.Rectangle;

import Model.Triangle;
import Model.Area;
import Model.Employee;
import Model.Employee1;


public class AppMain {

	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);

		Triangle ob=new Triangle(3,4,5);
		int p=ob.side1+ob.side2;
		float area=(float) (0.5*ob.side2*ob.side1);
		System.out.println("Perimeter: "+ p+ " unit");
		System.out.println("Area: "+ area+" sq unit");

		Rectangle rec=new Rectangle(4,5);
		System.out.println("AREA OF RECTANGLE1 = "+ rec.area() +" sq units");
		Rectangle rec1=new Rectangle(5,8);
		System.out.println("AREA OF RECTANGLE2 = "+ rec1.area() +" sq units");

		System.out.println("Enter the length of rectangle");
		int l=sc.nextInt();
		System.out.println("Enter the breadth of rectangle");
		int b=sc.nextInt();
		Rectangle area1=Area.setDim(l,b);
		Area obj2=new Area();
		//area1.setDim(l, b);
		System.out.println("Area := "+obj2.getArea(area1));

		System.out.println("Enter the number of passengers: ");
		int n=sc.nextInt();
		Employee[] emp = new Employee[n];

		int i=0;

		while(i<n)
		{
			System.out.println(" Passenger "+ (i+1));
			sc.nextLine();
			System.out.println("Enter name:");
			String name=sc.nextLine();
			System.out.println("Enter Year of Joining:");
			int yoj=sc.nextInt();
			//System.out.println("Enter salary");
			//int salary=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter address");
			String address=sc.nextLine();
			emp[i]=new Employee( name,yoj,address);

			i++;

		}i=0;
		System.out.println("Name    %10s     Year of Joining   %10s   Address   ");
		while(i<n)
		{System.out.println(emp[i]);
		i++;}
		System.out.println("Enter salary");
		int salary=sc.nextInt();
		System.out.println("Enter the number of hours of work");
		int h=sc.nextInt();
		Employee1 emp1 = new Employee1();
		emp1.getInfo(salary, h);
		int sal= emp1.AddSal(salary);
		int final_sal= emp1.AddWork(sal);
		System.out.println("Final salary = rs "+ final_sal);


	}

}
