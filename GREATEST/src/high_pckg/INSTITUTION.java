package high_pckg;

import java.util.Scanner;

public class INSTITUTION {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of students placed in CSE:");
		int n1=sc.nextInt();
		System.out.println("Enter the no of students placed in ECE:");
		int n2=sc.nextInt();
		System.out.println("Enter the no of students placed in MECH:");
		int n3=sc.nextInt();
        if (n1<0 || n2<0 || n3<0)
        	System.out.println("INPUT IS INVALID");
        else
        {
       
          if (n1>n2 && n1>n3 )
        	System.out.println("HIGHEST PLACEMENT  : CSE");
          else if (n2>n3 && n2>n1)
        	System.out.println("HIGHEST PLACEMENT  :  ECE");
          else if (n3>n2 && n3>n1)
        	System.out.println("HIGHEST PLACEMENT  :  MECH");
          else if(n1 == n2 && n1 >n3 )
        	System.out.println("HIGHEST PLACEMENT  :  CSE  ECE");
          else if (n2 == n3 && n2>n1 )
        	System.out.println("HIGHEST PLACEMENT  : ECE  MECH");
          else if (n3 == n1 && n3>n2 )
        	System.out.println("HIGHEST PLACEMENT  : CSE  MECH");
          else 
        	System.out.println("None of the department has got the highest placement");
        }
        	

		
		

	}

}
