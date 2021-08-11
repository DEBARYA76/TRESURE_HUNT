package App;

import Model.Student;

public class AppMain {

	public static void main(String[] args)
	
	{
		
			Student obj=new Student(2,"John");
			System.out.println(obj.roll);
			System.out.println(obj.name);
			
			Student obj1=new Student(2,03354,"Swapnil","Dumdum");
			Student obj2=new Student(3,487478445,"Ayushi","Chinar Park");
			System.out.println(" Roll :"+obj1.roll+" PHONE NUMBER: "+obj1.ph_no +" Name: "+obj1.name+" Adress:- "+obj1.address);
			System.out.println(" Roll :"+obj2.roll+" PHONE NUMBER: "+obj2.ph_no +" Name: "+obj2.name+" Adress:- "+obj2.address);
		}

	}

