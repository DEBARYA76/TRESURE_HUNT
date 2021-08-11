package Model;

public class Area {
	
	
	public static Rectangle setDim(int length, int breadth){
		Rectangle rectangle = new Rectangle(length, breadth);
		return rectangle;
		}


	/*public void setDim(int length,int breadth) {
		this.length = length;
		this.breadth = breadth;
	}
*/
	public int getArea(Rectangle rectangle) {
		return(rectangle.getLength()*rectangle.getBreadth());
	}

}
