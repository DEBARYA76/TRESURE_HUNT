package Model;



public class Student {
	public int roll;
	public  String name;
	public long  ph_no;
	public String address;



	public Student(int roll,String name)
	{
		this.roll=roll;
		this.name=name;
	}

	public Student(int roll,long ph,String name,String adress)
	{
		this.roll=roll;
		this.name=name;
		this.ph_no=ph;
		this.address=adress;

	}


}
