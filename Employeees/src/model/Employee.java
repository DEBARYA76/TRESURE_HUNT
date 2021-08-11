package model;

public class Employee  extends Member {
	
	
	private String specialization;
	public Employee(String name, int age, long phone_no, String address, int salary,String specialisation) {
		super(name, age, phone_no, address, salary);
		this.specialization=specialisation;
	}

	

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
}
