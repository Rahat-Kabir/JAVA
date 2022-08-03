
public abstract class Shape {
	private String Color;
	
	public Shape(String Color) {
		this.Color=Color;
	}
	
	public abstract  double area();
	public abstract String toString();
	
	public String getColor(){
		return Color;
	}
}
