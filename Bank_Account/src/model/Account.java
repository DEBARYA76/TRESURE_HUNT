package model;

public class Account {


	public String name;
	public String address;
	public String Typt_acc;
	public double balance;
	public int no_of_transc;
	public int acc_no;
	public Account(String name, String address, String typt_acc, double balance) {
		super();
		this.name = name;
		this.address = address;
		Typt_acc = typt_acc;
		this.balance = balance;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTypt_acc() {
		return Typt_acc;
	}
	public void setTypt_acc(String typt_acc) {
		Typt_acc = typt_acc;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public int getNo_of_transc() {
		return no_of_transc;
	}
	public void setNo_of_transc(int no_of_transc) {
		this.no_of_transc = no_of_transc;
	}
	public String toString() {
		return "Account [name=" + name + ", address=" + address + ", Typt_acc=" + Typt_acc + ", balance=" + balance
				+ "]";	}

}
