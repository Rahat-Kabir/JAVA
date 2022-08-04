
public class Circle extends GeometricObject {

	private double radius;
	
	Circle(){
		
	}
	
	Circle(double radius){
		this.radius=radius;
	}
	
	Circle(double radius,String color,boolean filled){
		super(color,filled);
		this.radius=radius;
	}
	public double getRadius(){
		return radius;
	}
	
	public void setRadius(double radius) {
		this.radius=radius;
	}
	
	public double getDiameter() {
		return 2*radius;
	}
	
	public double getArea() {
		return Math.PI * Math.pow(radius, 2);
	}
	
	public  double getPerimeter() {
		return 2*Math.PI*radius;
	}

	@Override
	public String toString() {
		return "This is Cirlce and " + " Color is "+super.getColor()+ " , Diameter is "+getDiameter()+ " "
				+ " Area is " +getArea()+ " Perimeter is "+ getPerimeter();
	}
	
	
	
}
