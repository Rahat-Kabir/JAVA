
public class Circle extends Shape{

	private double radius;
	
	public Circle(double radius,String Color) {
		super(Color);
		this.radius=radius;
	}
	
	public double area() {
		return Math.PI * Math.pow(radius, 2);
	}
	
	public String toString() {
		
		return "Circle Color is : "+super.getColor()+ " And Area is : " +area();
	}
}
