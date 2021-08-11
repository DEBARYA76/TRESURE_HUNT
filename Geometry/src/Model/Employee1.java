package Model;

public class Employee1 {
	private int salary;
	private int hour;

	public void getInfo(int salary,int hour) 
	{
		this.salary=salary;
		this.hour=hour;

	}
	public  int AddSal(int salary)
	{ 
		this.salary=salary;
		if(salary<=50000)
			this.salary+=1100;
		return this.salary;
	}
	public int AddWork(int sal)
	{
		this.salary=sal;
		if(this.hour>6)
			this.salary+=500;
		return this.salary;
	}

}
