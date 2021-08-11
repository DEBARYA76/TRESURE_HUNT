package Model;

public class Employee {

	private String name;
	private int year_of_joining;

	private String address;

	public Employee(String name, int year_of_joining,  String address) {

		this.name = name;
		this.year_of_joining = year_of_joining;
		//this.salary = salary;
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYear_of_joining() {
		return year_of_joining;
	}
	public void setYear_of_joining(int year_of_joining) {
		this.year_of_joining = year_of_joining;
	}


	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String toString()
	{
		return ( name + "   %10s   " + year_of_joining  + "    %10s  "
				+ address );
	}


}
