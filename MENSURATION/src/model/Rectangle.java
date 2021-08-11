package model;

public class Rectangle 
{
	public int length;
	public int breadth;
	public Rectangle(int length, int breadth)
	{

		this.length = length;
		this.breadth = breadth;
	}
	public void area()
	{
		System.out.println("AREA IS: "+ (this.length*this.breadth));
	}
	public void perimeter()
	{
		System.out.println("PERIMETER  IS "+(2*(this.length+this.breadth)));
	}
}
