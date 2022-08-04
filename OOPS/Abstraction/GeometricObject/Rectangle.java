
public class Rectangle extends GeometricObject {

	private double width;
	private double height;
	
	Rectangle(){
		
	}

	Rectangle(double width,double height){
		this.width=width;
		this.height=height;
	}
	
	Rectangle(double width,double height,String color,boolean filled){
		super(color,filled);
		this.height=height;
		this.width=width;
	}
	
	public double getWidth() {
		return width;
	}
	
	public void setWidth(double width ) {
		this.width=width;
	}
	
	public double getHeight(){
		return height;
	}
	
	public void setHeight(double height){
		this.height=height;
	}
	
	public double getArea() {
		return width*height;
	}
	
	public  double getPerimeter() {
		return 2*(width+height);
	}

	@Override
	public String toString() {
		return "This is Rectangle and " + " Color is "+super.getColor()+ " , Area is " +getArea()+ " Perimeter is "+ getPerimeter();

	}
	
}
