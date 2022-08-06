
public class Driver {
	public static void main(String[] args) {
		Polygon s = new Triangle (5,6,5.0);
		
		System.out.println("Area = "+s.area());
		System.out.println("Perimeter = "+s.perimeter());
	}
}
