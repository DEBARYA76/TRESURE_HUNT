package Model;

public class Rectangle {
	 private int length;
	 private int breadth;
	
	public Rectangle(int a,int b)
	{
		this.length=a;
		this.breadth=b;
		
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getBreadth() {
		return breadth;
	}
	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}
	public float area()
	{
		return (length*breadth);
		
	}

}
