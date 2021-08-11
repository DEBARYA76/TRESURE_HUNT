package model;

public class Square extends Rectangle
{ private int side;


public Square(int length, int breadth,int side)
{
	super(length, breadth);
	this.side=side;
}
public int getSide() {
	return side;
}
public void setSide(int side) {
	this.side = side;
}
public void mens()
{
	Rectangle obj=new Rectangle(this.side,this.side);
	obj.area();
	obj.perimeter();
}


public String toString() {
	return "Square [AREA=" + side*side + "]";
}
}

