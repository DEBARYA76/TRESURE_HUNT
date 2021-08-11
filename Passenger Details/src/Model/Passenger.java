package Model;

public class Passenger
{


	private  int ticketid;

	private String name;
	private String gender;
	private String address;



	public Passenger(int ticket,String name,String gender,String address)
	{  
		this.ticketid=ticket;
		this.name=name;
		this.gender=gender;
		this.address=address;

	}
	public void setticket(int ticket)
	{
		this.ticketid=ticket;	

	}
	public int getticket()
	{
		return this.ticketid;
	}



	public void setname(String newname)
	{
		this.name=newname;	

	}
	public String getname()
	{
		return this.name;
	}


	public void setlocation(String gender)
	{
		this.gender=gender;	

	}
	public String getgender()
	{
		return this.gender;
	}
	public void setpassword(String address)
	{
		this.address=address;	

	}
	public String getaddress()
	{
		return this.address;
	}
	public String toString() {
		return "Passenger [ticketid=" + ticketid + ", name=" + name + ", gender=" + gender + ", address=" + address
				+ "]";
	}
	
		
	}



