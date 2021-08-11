package model;

public class Manager  extends Member
{
	private String department;

	

	public Manager(String name, int age, long phone_no, String address, int salary,String department) {
		super(name, age, phone_no, address, salary);
		this.department=department;
		
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}

}
