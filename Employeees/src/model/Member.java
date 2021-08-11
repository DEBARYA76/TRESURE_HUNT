package model;

public class Member {
	
	
	private String Name;
	private  int Age;
	private long Phone_no;
	private String Address;
	private int Salary;
	
	
	public Member(String name, int age, long phone_no, String address, int salary) {
		super();
		Name = name;
		Age = age;
		Phone_no = phone_no;
		Address = address;
		Salary = salary;
	}

	public void printSalary()
	{
		System.out.println("The salary is Rs: "+ this.Salary);
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	public long getPhone_no() {
		return Phone_no;
	}

	public void setPhone_no(long phone_no) {
		Phone_no = phone_no;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public int getSalary() {
		return Salary;
	}

	public void setSalary(int salary) {
		Salary = salary;
	}

	public String toString() {
		return "Member [Name=" + Name + ", Age=" + Age + ", Phone_no=" + Phone_no + ", Address=" + Address + ", Salary="
				+ Salary + "]";
	}

}
