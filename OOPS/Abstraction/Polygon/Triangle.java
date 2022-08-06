
public class Triangle extends Polygon{

	private double sideA;
	private double sideB;
	private double sideC;
	
	public Triangle(double sideA,double sideB,double sideC){
		super();
		this.sideA=sideA;
		this.sideB=sideB;
		this.sideC=sideC;
	}

	public double getSideA() {
		return sideA;
	}

	public void setSideA(double sideA) {
		this.sideA = sideA;
	}

	public double getSideB() {
		return sideB;
	}

	public void setSideB(double sideB) {
		this.sideB = sideB;
	}

	public double getSideC() {
		return sideC;
	}

	public void setSideC(double sideC) {
		this.sideC = sideC;
	}
	
	public  double area(){
		double s = (sideA+sideB+sideC)/2;
		return Math.sqrt(s*(s-sideA)*(s-sideB)*(s-sideC));
	}
	
	public double perimeter() {
		return sideA+sideB+sideC;
	}
}
