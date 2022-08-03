
public class Rectangle extends Shape {

	private double length;
	private double width;

	public Rectangle(double length, double width, String Color) {
		super(Color);
		this.length = length;
		this.width = width;
	}

	public double area() {
		return length * width;
	}

	public String toString() {
		return "Circle Color is : " + super.getColor() + " And Area is : " + area();
	}
}
